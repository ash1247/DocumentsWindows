
public class VoteCount {
	
	Voting voting = new Voting();
	private UserDataManipulations data = new UserDataManipulations();
	
	public void count1Percentage()
	{
		float percentage = data.calculateOptionPercentage(1);
		data.updateOptionPercentage(1, percentage);
	}
	
	public void count2Percentage()
	{
		float percentage = data.calculateOptionPercentage(2);
		data.updateOptionPercentage(2, percentage);
	}
	
	public void count3Percentage()
	{
		float percentage = data.calculateOptionPercentage(3);
		data.updateOptionPercentage(3, percentage);
	}
	
	public void count4Percentage()
	{
		float percentage = data.calculateOptionPercentage(4);
		data.updateOptionPercentage(4, percentage);
	}
	
	public void count5Percentage()
	{
		float percentage = data.calculateOptionPercentage(5);
		data.updateOptionPercentage(5, percentage);
	}
	
}
