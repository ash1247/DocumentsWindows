
public class StudentInfo {

	private String name;
	private String day;
	private int id;
	
	public StudentInfo()
	{
		this("", " ", 0);
	}
	
	public StudentInfo(String nam, String bday, int i)
	{
		setName(nam);
		setbDay(bday);
		setId(i);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getbDay() {
		return day;
	}

	public void setbDay(String day) {
		this.day = day;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
