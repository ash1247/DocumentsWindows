
public class Problem5 {
	
	private String sName;
	private int agE;
	private String homeTown;
	private int idNum;
	private String religion;

	
	public Problem5(String name, int age, int id, String homeT, String reli)
	{
		setsName(name);
		setAgE(age);
		setHomeTown(homeT);
		setReligion(reli);
		setid(id);
		
	}
	
	public void setid(int id) {
		this.idNum = id;
	}

	public int getid()
	{
		return idNum;
	}
	
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsName() {
		return sName;
	}

	public void setAgE(int agE) {
		this.agE = agE;
	}
	
	public int getAgE() {
		return agE;
	}
	
	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}

	public String getHomeTown() {
		return homeTown;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getReligion() {
		return religion;
	}	

	
	public static void main(String[] args)
	{
		Problem5 s1 = new Problem5("Ashik",20, 16701060, "Chittagong", "Muslim");
		Problem5 s2 = new Problem5("Nirban",20, 16701064, "Chittagong", "Muslim");
		
		int count = 0;
		
		if( s1.getid() == s2.getid() )
		{
			System.out.println("Same Student.");
		}
		
		else
		{
			if(s1.getsName().equals(s2.getsName()))
			{
				count++;
			}
			if(s1.getHomeTown().equals(s2.getHomeTown()))
			{
				count++;
			}
			if(s1.getAgE() == s2.getAgE())
			{
				count++;
			}
			if(s1.getReligion().equals(s2.getReligion()))
			{
				count++;
			}	
			
			double percentage = ((double)count/ 4) *100;
			
			System.out.println("Similarity is " + percentage + "%");
		}
		
		
		
		
	}




}
