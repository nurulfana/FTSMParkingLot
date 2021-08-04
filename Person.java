
public class Person {
	private String fullname;
	private String occupation;
	private String icno;
	private String cellno;
	private Vehicle vehicleinfo;
	
	public Person(String n,String o,String i,String c,Vehicle v) {
		fullname = n;
		occupation = o;
		icno = i;
		cellno = c;
		vehicleinfo = v;
	}
	public String getFullname() {
		return fullname;
	}
	public String getOccupation() {
		return occupation;
	}
	public String getIcno() {
		return icno;
	}
	public String getCellno() {
		return cellno;
	}
	public Vehicle getVehicleinfo() {
		return vehicleinfo;
	}
	public String setFullname() {
		return fullname;
	}
	public String setOccupation() {
		return occupation;
	}
	public String setIcno() {
		return icno;
	}
	public String setCellno() {
		return cellno;
	}
	public Vehicle setVehicleinfo() {
		return vehicleinfo;
	}
}
class Student extends Person{
	private String matricno;
	
	public Student(String n,String o,String m,String i,String c,Vehicle v) {
	super(n,o,i,c,v);
	matricno = m;
	}
	public String getMatricno() {
		return matricno;
	}
	public String setMatricno() {
		return matricno;
	}
}
class Staff extends Person{
	private String staffno;
	
	public Staff(String n,String o,String s,String i,String c,Vehicle v) {
	super(n,o,i,c,v);
	staffno = s;
	}
	public String getStaffno() {
		return staffno;
	}
	public String setStaffno() {
		return staffno;
	}
}
class Management_Staff extends Person{
	private String managementno;
	
	public Management_Staff(String n,String o,String mi,String i,String c,Vehicle v) {
	super(n,o,i,c,v);
	managementno = mi;
	}
	public String getManagementid() {
		return managementno;
	}
	public String setManagementid() {
		return managementno;
	}
}
class Visitor extends Person{
	private String visitorno;
	
	public Visitor(String n,String o,String vi,String i,String c,Vehicle v) {
	super(n,o,i,c,v);
	visitorno = vi;
	}
	public String getVisitorno() {
		return visitorno;
	}
	public String setVisitorno() {
		return visitorno;
	}
}

	
