import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class EmpFileOperations {
	
	private Formatter empFileFormatter;
	private Scanner empFileScanner;
	private FileWriter empFileWriter;
	
	private String fileName;
	
	
	public  EmpFileOperations(String fileName){
		
		this.fileName = fileName;
		
	}
	
	public void openFormatter(boolean append){
		
		try{
			
			empFileWriter = new FileWriter(fileName, append);
			empFileFormatter = new Formatter(empFileWriter);
			empFileScanner = new Scanner(new File(fileName));
			
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "File Scanner Openning Fialed");
		}
		
	}
	
	
	public void addEmployee(Employee employee){
		
		openFormatter(true);
		empFileFormatter.format("%s %s \n", employee.getID(),employee.getName());
		empFileFormatter.close();
			
	}
	

	public ArrayList<Employee> getEmployees(){
		
		openFormatter(true);
		ArrayList<Employee> employees = new ArrayList<>();
		
		while(empFileScanner.hasNext()){
			
			String ID = empFileScanner.next();
			String name = empFileScanner.next();
			
			employees.add(new Employee(ID, name));	
		}		
		return employees;
	}

	public void writeEmployees(ArrayList<Employee> allEmployees) {
		
		openFormatter(false);
		
		for (Employee employee : allEmployees) {
			empFileFormatter.format("%s %s \n", employee.getID(),employee.getName());
			
		}
		empFileFormatter.close();
	}

}
