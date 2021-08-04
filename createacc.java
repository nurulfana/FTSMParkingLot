public class createacc {
	String fullname;
	String gender;
	String birthday;
	String email;	
	String mobileno;
	String username;
	String password;
	


	public createacc(String n, String g, String b, String e, String m,String u,String p) {
		fullname = n;
		gender = g;
		birthday = b;
		email = e;
		mobileno = m;
		username = u;
		password = p;
	}
	
	public String toString() {
		return  fullname + ", " + gender +","+birthday+ ","+email+","+mobileno+","+username+","+password;
	}
	

}
