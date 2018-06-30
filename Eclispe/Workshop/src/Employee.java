
public class Employee {
	
	private String name;
	private String ID;
	
	public Employee(String ID, String name) {
		super();
		this.name = name;
		this.ID = ID;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	
}
