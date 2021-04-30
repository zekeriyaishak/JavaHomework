
public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student(1, "ishak", "doğanay", "123456789",101);
		
		Student student2 = new Student();
		student2.id=2;
		student2.firstName="Rıdvan";
		student2.lastname="Doğanay";
		student2.password="987654321";
		student2.studentNumber=102;
		
		Student student3 = new Student();
		student3.id=3;
		student3.firstName="Hatice";
		student3.lastname="Özkan";
		student3.password="852147963";
		student3.studentNumber=103;
		
		Teacher teacher1 = new Teacher();
		teacher1.id=999;
		teacher1.firstName= "Engin";
		teacher1.lastname="Demiroğ";
		teacher1.password="789654123";
		teacher1.teacherDetail="Java Teacher";
		
		Teacher teacher2 = new Teacher(998,"Kerem","Varış","741852963","C# Teacher");
		System.out.println(student1.firstName + " " + student1.lastname);
		
		Teacher teacher3 = new Teacher();
		teacher3.id=997;
		teacher3.firstName= "Alkan";
		teacher3.lastname="Özkan";
		teacher3.password="963852741";
		teacher3.teacherDetail="Python Teacher";
		
		TeacherManager teacherManager  = new TeacherManager ();
		teacherManager.Add(teacher1);
		teacherManager.Delete(teacher2);
		teacherManager.Update(teacher3);
		teacherManager.createCouser("Python kursu");
		
		
		StudentManager studentmanager = new StudentManager();
		studentmanager.Add(student1);
		studentmanager.Delete(student2);
		studentmanager.Update(student3);
		studentmanager.selectCourse("C# kursu");
		
		
		
		
		
		}

}
