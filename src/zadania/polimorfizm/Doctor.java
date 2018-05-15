package zadania.polimorfizm;

public class Doctor extends Person {

	private double bonus;

	public Doctor(String name, String surname, double wyplata, double bonus) {
		super(name, surname, wyplata);
		this.bonus = bonus;

	}

	@Override
	public String toString() {
		return super.toString()+", bonus= " + bonus;
	}

}
