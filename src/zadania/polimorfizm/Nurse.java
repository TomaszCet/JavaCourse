package zadania.polimorfizm;

public class Nurse extends Person {

	private double overtime;

	public Nurse(String name, String surname, double wyplata, double overtime) {
		super(name, surname, wyplata);
		this.overtime = overtime;
	}

	@Override
	public String toString() {
		return super.toString() + ", overtime= " + overtime;
	}
}
