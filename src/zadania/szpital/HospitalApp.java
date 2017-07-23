package zadania.szpital;

import java.util.Scanner;

public class HospitalApp {

	public static void main(String[] args) {
		final int EXIT = 0;
		final int ADD_Patient = 1;
		final int PRINT_QUERY = 2;
		Scanner sc = new Scanner(System.in);
		Hospital hospital = new Hospital();

		
		int action = 4;
		while (action != EXIT) {
			System.out.println(" 0-wyjœcie;\n 1-dodaj do kolejki;\n 2-wyswietl;\n\n Co chcesz zrobiæ?");
			action = sc.nextInt();
			sc.nextLine();
			switch (action) {
			case ADD_Patient:
				Patient patient = new Patient();
				System.out.println("Podaj imie: ");
				patient.setName(sc.nextLine());
				System.out.println("Podaj nazwisko: ");
				patient.setSurname(sc.nextLine());
				System.out.println("Podaj PESEL: ");
				patient.setPesel(sc.nextLine());
				hospital.addToQuery(patient);
				break;
			case PRINT_QUERY:
				hospital.showQuery();
				break;
			case EXIT:
				System.out.println("Do widzenia!");
			default:
				System.out.println("Nie ma takiej akcji");
			}
			
		}
		sc.close();
	}

}
