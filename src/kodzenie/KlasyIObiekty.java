package kodzenie;

public class KlasyIObiekty {

	public static void main(String[] args) {
		Employee prac1 = new Employee("tom", "jerry", 1992, 1);
		Employee prac2 = new Employee("mlotek", "osika", 1900, 4);
		Employee prac3 = new Employee("kowal", "jerry", 2000, 3);
		System.out.println(prac1.toString());
		System.out.println(prac2.toString());
		System.out.println(prac3.toString());
	}


}

class Employee {

	String name;
	String surname;
	int birthDay;
	double experienceInYears;

	public Employee(String name, String surname, int birthDay, double experienceInYears) {
		super();
		this.name = name;
		this.surname = surname;
		this.birthDay = birthDay;
		this.experienceInYears = experienceInYears;

	}

	@Override
	public String toString() {
		String string = name + " " + surname + " born in " + birthDay + ". Employed from " + experienceInYears
				+ " year(s)";
		return string;
	}

}


