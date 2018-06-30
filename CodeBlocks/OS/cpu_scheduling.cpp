#include <iostream>
#include <vector>
#include <iterator>
#include <algorithm>
#include <fstream>
#include <numeric>
#include <cstdlib>
#include <deque>

std::vector<double> np_sjf_total_avg_turnaround_time;
std::vector<double> np_sjf_total_avg_waiting_time;
std::vector<double> round_robin_total_avg_turnaround_time;
std::vector<double> round_robin_total_avg_waiting_time;
std::deque<std::pair<std::string, int>> qsi;
std::ofstream out("output.txt");

struct Process {
    std::string p_id;
    int burst_time;
    int arrival_time;
    int temp_burst_time;
    int completion_time;
    int waiting_time;
    int turnaround_time;
};

bool comparison(Process a, Process b) {
    if( a.arrival_time == b.arrival_time)
        return a.burst_time < b.burst_time;
    else
        return a.arrival_time < b.arrival_time;
}

bool comparison_by_arrival_time(Process a, Process b) {
    return a.arrival_time < b.arrival_time;
}

std::vector<Process> read_from_file(std::istream &in) {
    std::istream_iterator<Process> i_iter(in), eof;
    std::vector<Process> vec_process(i_iter, eof);
    return vec_process;
}

void write_random_process() {

    // inputs are written first column is process name,
    // second column is arrival time
    // third column is burst time
    std::ofstream out("process.txt",std::ofstream::app);
    for(int i = 1; i <= 11; i++)
    {
        //arrival time = 41 burst time 11
        std::string j = "P" + std::to_string(i);
        int k = (rand() % 41)+1;//arrival time here, burst time in specification
        int l = (rand() % 11)+1; // burst time
        out << j << " " << k << " " << l << "\n";
    }
    out << "\n";
}

std::istream& operator>>(std::istream& in, Process& ps) {
    in >> ps.p_id >> ps.arrival_time >> ps.burst_time;
    return in;
}

std::ostream& operator<<(std::ostream& out, Process& ps) {
    out << ps.p_id << "\t" << ps.arrival_time << "\t" <<
        ps.burst_time << "\t" << ps.completion_time << "\t" << ps.waiting_time <<
        "\t" << ps.turnaround_time;
    return out;
}

void print_input(const std::vector<Process> &proc) {
    std::cout << "\t\tInput from file\n";
    std::cout << "Process Id\tArrival-Time\tBurst-Time\n";
    int i = 1;
    int j = 0;
    for(auto e : proc) {
        if( i % 11 == 1) {
            j++;
            std::cout << "\n\t\tTest case" + std::to_string(j) + "\n";
        }
        std::cout << e.p_id << "\t\t" << e.arrival_time << "\t\t" << e.burst_time << std::endl;
        i++;
    }
}

void find_waiting_time_np_sjf(std::vector<Process> &proc, int b, int e) {
    proc[b].waiting_time = 0;

    for (int i = b + 1; i < e ; i++) {
        proc[i].waiting_time = proc[i-1].burst_time + proc[i-1].waiting_time ;
    }
}

void find_waiting_time_robin_round(std::vector<Process> &proc, int b, int e, int quantum) {

    for (int i = b; i < e; i++)
        proc[i].temp_burst_time = proc[i].burst_time;
    int tim = 0;
    while (true) {
        bool done = true;

        for (int i = b; i < e; i++) {
            if ( proc[i].temp_burst_time > 0) {
                done = false;
                if ( proc[i].temp_burst_time > quantum) {
                    tim += quantum;
                    proc[i].temp_burst_time -= quantum;
                    qsi.push_back( {proc[i].p_id, quantum});
                }
                else {
                    tim += proc[i].temp_burst_time;
                    qsi.push_back( {proc[i].p_id, quantum});
                    proc[i].waiting_time = tim - proc[i].burst_time;
                    proc[i].temp_burst_time = 0;
                }
            }
        }
        if (done == true)
          break;
    }
}

void find_turnaround_time(std::vector<Process> &proc, int b, int e) {
    for (int i = b; i < e ; i++)
        proc[i].turnaround_time = proc[i].burst_time + proc[i].waiting_time;
}

void find_completion_time(std::vector<Process> &proc, int b, int e) {
    for (int i = b; i < e ; i++)
        proc[i].completion_time = proc[i].arrival_time + proc[i].turnaround_time;
}

void find_avg_time(std::vector<Process> &proc, int b, int e, int check) {
    int total_wt = 0;
    int total_tat = 0;
    int n = e - b + 1;

    for (int i = b; i < e; i++)
    {
        total_wt = total_wt + proc[i].waiting_time;
        total_tat = total_tat + proc[i].turnaround_time;
    }

    double avg_waiting_time = (double)total_wt / (double)n;
    double avg_turnaround_time = (double)total_tat / (double)n;

    if( check == 1) {
        np_sjf_total_avg_turnaround_time.push_back(avg_turnaround_time);
        np_sjf_total_avg_waiting_time.push_back(avg_waiting_time);
    }
    else if(check == 0) {
        round_robin_total_avg_turnaround_time.push_back(avg_turnaround_time);
        round_robin_total_avg_waiting_time.push_back(avg_waiting_time);
    }
    out << "Average waiting time = "
         << avg_waiting_time;
    out << "\nAverage turn around time = "
         << avg_turnaround_time << std::endl;

    //std::cout << "Average waiting time = "
      //   << avg_waiting_time;
    //std::cout << "\nAverage turn around time = "
      //   << avg_turnaround_time << std::endl;
}

void gantt_chart_np_sjf(std::vector<Process> &proc, int b, int e) {

    //std::sort(proc.begin() + b, proc.begin() + b, comparison_by_arrival_time );
    //std::cout << "Gantt Chart\n";
    out << "Gantt Chart\n";
    int temp = proc[b].arrival_time;
    for(int i = b; i < e; i++) {

        if( temp > 0) {
            out << "[ X(0" << "-" << proc[b].arrival_time << ") ]";
            temp = 0;
            i--;
            continue;
            //std::cout << "[ X(" << proc[i].completion_time << "-" << proc[i].arrival_time << ") ]";
        }
        /*
        else {
                if( (proc[i].completion_time - proc[i].burst_time) != proc[i-1].completion_time ) {
                    out << "[ X(" << proc[i].completion_time - proc[i].burst_time
                    << "-" << proc[i-1].completion_time << ") ]";
                    //i--;
                    //continue;
                }
        */
        else {
            out << "[ " << proc[i].p_id << "(" << proc[i].completion_time - proc[i].burst_time
                << "-" << proc[i].completion_time << ") ]";
                //std::cout << "[ " << proc[i].p_id << "(" << proc[i].completion_time << "-"
                                        //<< proc[i].completion_time + proc[i].burst_time << ") ]";
        }
    }
    out << "\n\n";
    //std::cout << "\n\n";
}

void gantt_chart_rr(std::vector<Process> &proc, int b, int e) {

    //std::cout << "Gantt Chart\n";

    for (int i = b; i < e; i++)
        proc[i].temp_burst_time = proc[i].burst_time;
    int tim = 0;

    out << "Gantt Chart\n";
    int temp = proc[b].arrival_time;
    if( temp > 0) {
        out << "[ X(0" << "-" << proc[b].arrival_time << ") ]";
        temp = 0;
        //std::cout << "[ X(" << proc[i].completion_time << "-" << proc[i].arrival_time << ") ]";
    }
    temp = proc[b].arrival_time;
    for(auto i : qsi) {
        out << "[ " << i.first << "(" << temp
                << "-" << temp + i.second << ") ]";
        temp = temp + i.second;
    }

    qsi.clear();
    out << "\n\n";
    //std::cout << "\n\n";
}

void np_sjf(std::vector<Process> &proc, int b,int e) {
	std::sort(proc.begin()+b,proc.begin()+e,comparison);
	find_waiting_time_np_sjf( proc, b, e);
	find_turnaround_time(proc, b ,e);
	find_completion_time(proc, b, e);
	gantt_chart_np_sjf(proc, b, e);
	find_avg_time(proc, b, e, 1);
}

void round_robin(std::vector<Process> &proc, int b,int e) {
	std::sort(proc.begin()+b,proc.begin()+e, comparison_by_arrival_time );

	find_waiting_time_robin_round( proc, b, e, 2);
	find_turnaround_time(proc, b ,e);
	find_completion_time(proc, b, e);
	gantt_chart_rr(proc, b, e);
	find_avg_time(proc, b, e, 0);

}

void final_time(std::vector<Process> &proc) {

    double total_burst_time = 0;
    int size = np_sjf_total_avg_turnaround_time.size();
    double np_sjf_total_tat = 0, np_sjf_total_wt = 0;
    double rr_total_tat = 0, rr_total_wt = 0;
    for(int i = 0; i < size; i++) {
        np_sjf_total_tat += np_sjf_total_avg_turnaround_time[i];
        np_sjf_total_wt += np_sjf_total_avg_waiting_time[i];
        rr_total_tat += round_robin_total_avg_turnaround_time[i];
        rr_total_wt += round_robin_total_avg_waiting_time[i];
    }

    for(auto e : proc)
        total_burst_time += e.burst_time;

    out << "Final Averege CPU Burst Time: " << total_burst_time / double(proc.size()) << std::endl;
    out << "Final Averege Turnaround Time (NP-SJF Scheduling): " << np_sjf_total_tat / double(size) << std::endl;
    out << "Final Averege Waiting Time (NP-SJF Scheduling): " << np_sjf_total_wt / double(size) << std::endl;
    out << "Final Averege Turnaround Time (RR Scheduling): " << rr_total_tat / double(size) << std::endl;
    out << "Final Averege Waiting Time (RR Scheduling): " << rr_total_wt / double(size) << std::endl;


    //std::cout << "Final Averege CPU Burst Time: " << total_burst_time / double(proc.size()) << std::endl;
    //std::cout << "Final Averege Turnaround Time (NP-SJF Scheduling): " << np_sjf_total_tat / double(size) << std::endl;
    //std::cout << "Final Averege Waiting Time (NP-SJF Scheduling): " << np_sjf_total_wt / double(size) << std::endl;
    //std::cout << "Final Averege Turnaround Time (RR Scheduling): " << rr_total_tat / double(size) << std::endl;
    //std::cout << "Final Averege Waiting Time (RR Scheduling): " << rr_total_wt / double(size) << std::endl;
}

int main() {
    //for(int i = 0; i < 81; i++)
    //   write_random_process(); //for write input into file
    std::cout << "Please make sure \'process.txt\' is in the same"
                << "\ndirectory with the programme.\n";
    std::ifstream in("process.txt");
    std::vector<Process> proc = read_from_file(in);
    int j = 1;
    in.close();
    for(int i = 0; i < proc.size(); i += 11) {
        if( i % 11 == 0) {
            out << "Test Case-" + std::to_string(j) + "\n";
            //std::cout << "Test Case-" + std::to_string(j) + "\n";
            j++;
        }
        out << "For Non-Preemptive Shortest Job First\n";
        //std::cout << "For Non-Preemptive Shortest Job First\n";
        np_sjf(proc, i , i+11);
        out << "\nFor Robin Round\n";
        out << "Time quantum is 2\n";
        //std::cout << "\nFor Robin Round\n";
        round_robin(proc, i , i+11);

        out << "\n\n";
        //std::cout << "\n\n";
    }
    final_time(proc);

    std::cout << "Finished\n";
    /*
    int i = 0;
    std::cout << "\n\nP_ID\tAT\tBT\tCT\tWT\tTAT";
    for(auto e : proc) {
        if (i == 22)
            break;
        if( i % 11 == 0)
            std::cout << "\n\n";
        std::cout << e << std::endl;
        i++;
    }
    */
    out.close();
    //print_input(proc);

    return 0;
}

