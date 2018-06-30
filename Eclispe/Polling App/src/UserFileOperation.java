import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Formatter;
import javax.swing.JOptionPane;

public class UserFileOperation {
	
	private ArrayList <UserData> allUserResults = new ArrayList<>();
	private Formatter formatter;
	private FileWriter fileWriter;
	private String fileName = "Results.txt";
		
	public void openFormatter(boolean append){
		
		try{
			
			fileWriter = new FileWriter(fileName, append);
			formatter = new Formatter(fileWriter);
			
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, e.getMessage() );
		}
		
	}
		
	public void addData(UserData userData)
	{
		openFormatter(true);
		formatter.format("%s\n", userData.getInputData());
		formatter.close();
	}
	
	public void saveUserResult(String inputData)
	{
		UserData userData = new UserData(inputData);
		allUserResults.add(userData);
		addData(userData);	
	}
	
	
	
	public void writeUserData(ArrayList<UserData> allUserData) {
		
		openFormatter(false);
		
		for (UserData userData : allUserData) {
			formatter.format("%s\n",userData.getInputData() );
		}
		formatter.close();
	}
	
	public void writeUserResult(){		 
		writeUserData(allUserResults);
		allUserResults.clear();
	}
			
}



	
