package zadania.polimorfizm;

public class HospitalApp {

	public static void main(String[] args) {
		Hospital hospital = new Hospital(10);
		hospital.add(new Doctor("a", "b", 1000, 100));
		hospital.add(new Nurse("b",	 "c", 500, 12));
		hospital.add(new Nurse("d",	 "e", 600, 10));
		
		hospital.printPeople();
	}
	

}
