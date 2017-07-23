package zadania.staticUniversity;

public class University {

	public static void main(String[] args) {
		System.out.println(Student.numberOfStudents);
		Student student1 =new Student();
		System.out.println(Student.numberOfStudents);
		Student student2 =new Student("tom","cet","12324");
		System.out.println(Student.numberOfStudents);
	}

}
