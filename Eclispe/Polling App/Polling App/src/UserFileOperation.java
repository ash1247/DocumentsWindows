import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class UserFileOperation {

	private Formatter formatter;
	private Scanner scanner;
	private FileWriter fileWriter;
	private String fileName;
	
	public UserFileOperation(String fileName)
	{
		this.fileName = fileName;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public void openFormatter(boolean append){
		
		try{
			
			fileWriter = new FileWriter(fileName, append);
			formatter = new Formatter(fileWriter);
			scanner = new Scanner(new File(fileName));
			
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, e.getMessage() );
		}
		
	}
	
	public void addUser(User user){
		
		openFormatter(true);
		formatter.format("%s \n",user.getpassword() );
		formatter.close();
			
	}

	public String getUserPassword(){
		
		openFormatter(true);	
		ArrayList <String> allusers = new ArrayList<String>();
		while(scanner.hasNext() ){
			
			String password = scanner.next();
			allusers.add(password);
		}		
		StringBuilder builder = new StringBuilder();
		
		for (String word : allusers) {
		    builder.append(word);
		}
		
		String string = builder.toString();//remove trailing spaces from partially initialized arrays
		return string;
	}
	
	public void writeUserPassword(ArrayList<User> allusers) {
		
		openFormatter(false);
		
		for (User user : allusers) {
			formatter.format("%s\n",user.getpassword() );
			
		}
		formatter.close();
	}
	
	public void addData(UserData userData)
	{
		openFormatter(true);
		formatter.format("%s\n", userData.getInputData());
		formatter.close();
	}
	
	public String getUserData(){
		
		openFormatter(true);	
		ArrayList <String> allUserData = new ArrayList<String>();
		while(scanner.hasNext() ){
			
			String data = scanner.next();
			allUserData.add(data);
		}	
		
		StringBuilder builder = new StringBuilder();
	
		for (String word : allUserData) {
		    builder.append(word);
		    builder.append(" ");
		}
		String string = builder.toString();//remove trailing spaces from partially initialized arrays
		
		return string;
	}

	public void writeUserData(ArrayList<UserData> allUserData) {
		
		openFormatter(false);
		
		for (UserData userData : allUserData) {
			formatter.format("%s\n",userData.getInputData() );
		}
		formatter.close();
	}
	
	public ArrayList<String> getVoters()
	{
		openFormatter(true);
		ArrayList<String> voters = new ArrayList<>();
		
		while(scanner.hasNext()){
			
			String ID = scanner.next();
			
			voters.add(ID) ;	
		}	
		return voters;
		
	}
	
	
	
}


	
