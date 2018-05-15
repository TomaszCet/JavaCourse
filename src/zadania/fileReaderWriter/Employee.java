package zadania.fileReaderWriter;

public class Employee extends Person {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1878576811634451369L;
	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(String name, String surname, double salary) {
		super(name, surname);
		this.salary = salary;
	}
	
}
