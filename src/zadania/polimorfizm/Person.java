package zadania.polimorfizm;

public class Person {
	private String name;
	private String surname;
	private double wyplata;

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

	public double getwyplata() {
		return wyplata;
	}

	public void setwyplata(double wyplata) {
		this.wyplata = wyplata;
	}

	@Override
	public String toString() {
		return "name= " + name + ", surname= " + surname + ", wyplata= " + wyplata;
	}

	public Person(String name, String surname, double wyplata) {
		this.name = name;
		this.surname = surname;
		this.wyplata = wyplata;
	}

}
