#include <bits/stdc++.h>

using namespace std;
inline void keep_window_open() { char ch; cin >> ch; }

int main(void)
{
	string previous = "";
	string current;
	while (cin >> current)
	{
		if (previous == current)
		{
			cout << "repeated word:" << current << "\n";
		}
		previous = current;
	}

	keep_window_open();

	return 0;
}