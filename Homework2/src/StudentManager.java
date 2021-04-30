
public class StudentManager extends UserManager {
	@Override
	public void Add(User user) {
		super.Add(user);
	}
	
	@Override
	public void Delete(User user) {
		super.Delete(user);
	}
	 public void selectCourse(String courseName) {
		 System.out.println(courseName + " ismindeki kurs seçildi");
	 }
}
