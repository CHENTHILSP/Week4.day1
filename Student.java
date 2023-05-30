package Assignment2EducationalInstitution;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("Chenthil Sp");
	}
	public void studentDepartment() {
		System.out.println("CIVIL");
	}
	public void  studentId() {
		System.out.println("1910");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student call = new Student();
		call.collegeName();
		call.collegeCode();
		call.collegeRank();
		call.departmentName();
		call.studentName();
		call.studentDepartment();
		call.studentId();

	}

}
