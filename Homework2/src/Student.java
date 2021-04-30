
public class Student extends User {
	int studentNumber;
	public Student() {
		
	}
	public Student(int id, String firstName, String lastname, String password, int studentNumber) {
		super(id, firstName, lastname, password);
		this.studentNumber = studentNumber;
	}
	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

} 		 
