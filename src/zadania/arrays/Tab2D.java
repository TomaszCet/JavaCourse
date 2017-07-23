package zadania.arrays;

public class Tab2D {

	public static void main(String[] args) {
		double tab[][] = { { 1, 1.5, 2.0 }, { 1.5, 2., 2.5 }, { 2.0, 2.5, 3.0 } };
		double sumIloczynowPrzekatnych = 0;
		double ilprzek1 = 1, ilprzek2 = 0, srWiersz = 0, srKol = 0, sumTotal = 0;

		for (int i = 0; i < 3; i++) {
			ilprzek1 *= tab[i][i];
			ilprzek2 *= tab[2 - i][i];
			srWiersz += tab[1][i];
			srKol += tab[i][1];
			for (int j = 0; j < 3; j++) {
				sumTotal += tab[i][j];
			}
		}

		sumIloczynowPrzekatnych += ilprzek1 + ilprzek2;
		System.out.println("Suma iloczynów przek¹tnych wynosi: " + sumIloczynowPrzekatnych);
		System.out.println("Iloczyn sum œrodkowych wynosi: " + (srKol * srWiersz));
		System.out.println("Suma wszystkich prócz œrodkowego wynosi: " + (sumTotal - tab[1][1]));
	}

}
