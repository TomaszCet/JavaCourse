package zadania.szpital;

public class Hospital {

	Patient patientQuery[];
	int patientsInQuery;

	public Hospital() {
		patientQuery = new Patient[10];
		patientsInQuery = 0;
	}

	public void addToQuery(Patient patient) {
		if (patientsInQuery < 10) {
			patientQuery[patientsInQuery] = patient;
		}
		else {
			System.out.println("Osi¹gniêto maksymaln¹ liczbê pacjentów");
		}
		patientsInQuery++;
	}

	public void showQuery() {
		for (int i=0; i<patientsInQuery; i++) {
			System.out.println("Pacjent: " + patientQuery[i].toString());
		}
	}
}
