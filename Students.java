package Assignment4;

public class Students {
	
	public void getStudentInfo(int ID) {
		System.out.println("ID: " + ID);
	}
	public void getStudentInfo(int ID, String Name) {
		System.out.println("ID: " + ID + " & " + "Name: " + Name);
	}
	public void getStudentInfo(String email, long phoneNumber) {
		System.out.println("Email: " + email + " & " + "Phone Number: " + phoneNumber);
	}
	
	
	public static void main(String[] args) {
		Students call = new Students();
		call.getStudentInfo(1234);
		call.getStudentInfo(1234, "ChenthilSp");
		call.getStudentInfo("testleaf10@gmail.com", 98756446532L);
	}

}
