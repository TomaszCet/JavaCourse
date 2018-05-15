package zadania.fileReaderWriter;

public class Company {
	final static int NUMBER_OF_EMPLOYEES = 3;
	Employee employeetab[];

	public Employee[] getEmployeetab() {
		return employeetab;
	}

	public void setEmployeetab(Employee[] employeetab) {
		this.employeetab = employeetab;
	}

	public Company() {
		employeetab = new Employee[NUMBER_OF_EMPLOYEES];
	}
}
