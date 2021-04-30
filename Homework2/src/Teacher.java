
public class Teacher extends User {
     String teacherDetail;
	 public Teacher() {
		 
	 }
	public Teacher(int id, String firstName, String lastname, String password, String teacherDetail) {
		super(id, firstName, lastname, password);
		this.teacherDetail = teacherDetail;
	}
	public String getTeacherDetail() {
		return teacherDetail;
	}
	public void setTeacherDetail(String teacherDetail) {
		this.teacherDetail = teacherDetail;
	}
	
	



}
