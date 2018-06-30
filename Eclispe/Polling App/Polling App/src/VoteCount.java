
public class VoteCount {
	
	Voting voting = new Voting();
	
	protected float count = (float) Voting.count;
	protected float count1 = (float) Voting.count1;
	protected float count2 = (float) Voting.count2;
	protected float count3 = (float) Voting.count3;
	protected float count4 = (float) Voting.count4;
	protected float count5 = (float) Voting.count5;
	
	
	public float count1Percentage()
	{
		float percentage = (count1 / count) * 100;
		return percentage;
	}
	
	public float count2Percentage()
	{
		float percentage = (count2 / count) * 100;
		return percentage;
	}
	
	public float count3Percentage()
	{
		float percentage = (count3 / count) * 100;
		return percentage;
	}
	
	public float count4Percentage()
	{
		float percentage = (count4 / count) * 100;
		return percentage;
	}
	
	public float count5Percentage()
	{
		float percentage = (count5 / count) * 100;
		return percentage;
	}
	
}
