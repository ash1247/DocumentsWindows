import java.util.ArrayList;

public class UserDataManipulations {
	
	
	private UserFileOperation operation = new UserFileOperation("Admin");
	private UserFileOperation operationTopic = new UserFileOperation("Topic");
	private UserFileOperation operationVoters = new UserFileOperation("Voters");
	private UserFileOperation operationOption1 = new UserFileOperation("Option1");
	private UserFileOperation operationOption2 = new UserFileOperation("Option2");
	private UserFileOperation operationOption3 = new UserFileOperation("Option3");
	private UserFileOperation operationOption4 = new UserFileOperation("Option4");
	private UserFileOperation operationOption5 = new UserFileOperation("Option5");
	private UserFileOperation result = new UserFileOperation("Result.txt");
	
	private ArrayList <User> allusers = new ArrayList<>();
	private ArrayList <UserData> allUserData = new ArrayList<>();
	private ArrayList <UserData> allUserResults = new ArrayList<>();

	public void writeUserFile(){
		operation.writeUserPassword(allusers);		
	}
	
	
	public void writeUserResult(){		 
		result.writeUserData(allUserResults);
		allUserResults.clear();
		
	}
	
	public void writeUserTopic(){
		operationTopic.writeUserData(allUserData);	
	}
	
	public void writeUserOption1(){
		operationOption1.writeUserData(allUserData);	
		allUserData.clear();
	}
	
	public void writeUserOption2(){
		operationOption2.writeUserData(allUserData);
		allUserData.clear();
	}
	
	public void writeUserOption3(){
		operationOption3.writeUserData(allUserData);
		allUserData.clear();
	}
	
	public void writeUserOption4(){
		operationOption4.writeUserData(allUserData);
		allUserData.clear();
	}
	
	public void writeUserOption5(){
		operationOption5.writeUserData(allUserData);
		allUserData.clear();
	}
	
	public void writeVoterId(){
		operationVoters.writeUserData(allUserData);
		allUserData.clear();
	}
	
	
	public void saveUserData(String inputData)
	{
		User user = new User(inputData);
		allusers.add(user);
		operation.addUser(user);
	}
	
	
	public void saveUserTopic(String inputData)
	{
		UserData userData = new UserData(inputData);
		allUserData.add(userData);
		result.addData(userData);	
	}
	
	public void saveUserResult(String inputData)
	{
		UserData userData = new UserData(inputData);
		allUserResults.add(userData);
		result.addData(userData);	
	}
	
	public void saveUserOption1(String inputData)
	{
		UserData userData = new UserData(inputData);
		allUserData.add(userData);
		operationOption1.addData(userData);
	}
	
	public void saveUserOption2(String inputData)
	{	
		UserData userData = new UserData(inputData);
		allUserData.add(userData);
		operationOption2.addData(userData);
	}
	
	public void saveUserOption3(String inputData)
	{	
		UserData userData = new UserData(inputData);
		allUserData.add(userData);
		operationOption3.addData(userData);
	}
	
	public void saveUserOption4(String inputData)
	{	
		UserData userData = new UserData(inputData);
		allUserData.add(userData);
		operationOption4.addData(userData);
	}
	
	public void saveUserOption5(String inputData)
	{	
		UserData userData = new UserData(inputData);
		allUserData.add(userData);
		operationOption5.addData(userData);
	}
	
	public void addVoters(String inputData)
	{	
		UserData userData = new UserData(inputData);
		allUserData.add(userData);
		operationVoters.addData(userData);
	}
	
	public void deleteVoters()
	{
		
	}
	
	public String stringResizer(String str)
	{
		String str1 = str.replace("<html>","").replace("<br>","").replace("</html>", "");
		return str1;
	}
	
				
	
}
