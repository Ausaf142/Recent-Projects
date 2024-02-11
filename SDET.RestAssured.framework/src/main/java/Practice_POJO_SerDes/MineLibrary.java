package Practice_POJO_SerDes;

public class MineLibrary {
//Declare Global Variable
	String name;
	String FatherName;
	String MotherName;
	String ElderBro;
	String Bro;
	int Phone;
	public MineLibrary(String name, String fatherName, String motherName, String elderBro, String bro, int phone) {
		
		this.name = name;
		this.FatherName = fatherName;
		this.MotherName = motherName;
		this.ElderBro = elderBro;
		this.Bro = bro;
		this.Phone = phone;
	}
	
	public MineLibrary() {
		
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFatherName() {
		return FatherName;
	}
	public void setFatherName(String fatherName) {
		FatherName = fatherName;
	}
	public String getMotherName() {
		return MotherName;
	}
	public void setMotherName(String motherName) {
		MotherName = motherName;
	}
	public String getElderBro() {
		return ElderBro;
	}
	public void setElderBro(String elderBro) {
		ElderBro = elderBro;
	}
	public String getBro() {
		return Bro;
	}
	public void setBro(String bro) {
		Bro = bro;
	}
	public int getPhone() {
		return Phone;
	}
	public void setPhone(int phone) {
		Phone = phone;
	}
	
	
}
