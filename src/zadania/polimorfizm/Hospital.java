package zadania.polimorfizm;


public class Hospital {

	private Person people[];
	private int actualNumberOfPeople;

	public int getActualNumberOfPeople() {
		return actualNumberOfPeople;
	}

	public Hospital(int numberOfPeople) {
		this.people = new Person[numberOfPeople];
		this.actualNumberOfPeople = 0;
	}

	public void add(Person person) {
		people[actualNumberOfPeople] = person;
		actualNumberOfPeople++;
	}
	public void	printPeople(){
		for (int i=0; i<this.getActualNumberOfPeople();i++){
			System.out.println(people[i]);
		}
	}

}
