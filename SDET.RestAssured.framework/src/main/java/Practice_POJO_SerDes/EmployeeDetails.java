package Practice_POJO_SerDes;

public class EmployeeDetails {
	String name;
	int phone;
	String Email;
	String Id;
	boolean isEmployed;
	
	public EmployeeDetails(String name, int phone, String email, String id, boolean isEmployed) {
		
		this.name = name;
		this.phone = phone;
		this.Email = email;
		this.Id = id;
		this.isEmployed = isEmployed;
	}
	
	public EmployeeDetails() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		this.Email = email;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		this.Id = id;
	}
	public boolean isEmployed() {
		return isEmployed;
	}
	public void setEmployed(boolean isEmployed) {
		this.isEmployed = isEmployed;
	}
	
	
	
	

}
