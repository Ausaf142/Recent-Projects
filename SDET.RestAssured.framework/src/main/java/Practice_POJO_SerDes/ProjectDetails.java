package Practice_POJO_SerDes;

public class ProjectDetails {
	String name;
	int id;
	int Salary;
	
	public ProjectDetails(String name, int id, int salary) {
		this.name = name;
		this.id = id;
		this.Salary = salary;
	}
	public ProjectDetails() {
	
	}
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public int getSalary() {
		return Salary;
	}
	
	
	
	
	
}
