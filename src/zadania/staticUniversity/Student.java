package zadania.staticUniversity;

public class Student {
	private String name;
	private String surname;
	private String indexNumber;
	public static int numberOfStudents=0;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getIndexNumber() {
		return indexNumber;
	}

	public void setIndexNumber(String indexNumber) {
		this.indexNumber = indexNumber;
	}

	public Student(String name, String surname, String indexNumber) {
		this.name = name;
		this.surname = surname;
		this.indexNumber = indexNumber;
		numberOfStudents++;
	}

	public Student() {
		numberOfStudents++;
	}

	@Override
	public String toString() {
		return "Student: " + this.getName() + ", surname=" + this.getSurname() + ", numer indekxu=" + this.getIndexNumber() + "]";
	}
}
