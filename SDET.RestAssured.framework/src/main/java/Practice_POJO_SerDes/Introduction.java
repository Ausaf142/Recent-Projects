package Practice_POJO_SerDes;

//Step-1:Declare Global Variable

public class Introduction {
String Fname;
String Lname;
int mob;
String state;

//Step-2:create Constructor

public Introduction(String fname, String lname, int mob, String state) {

	this.Fname = fname;
	this.Lname = lname;
	this.mob = mob;
	this.state = state;
}

//Step-3:Create getters and setters

public Introduction() {
	
}

public String getFname() {
	return Fname;
}
public void setFname(String fname) {
	Fname = fname;
}
public String getLname() {
	return Lname;
}
public void setLname(String lname) {
	Lname = lname;
}
public int getMob() {
	return mob;
}
public void setMob(int mob) {
	this.mob = mob;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}






}
