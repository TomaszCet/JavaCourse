package zadania.stringStringBuiderStringBuffer;

import java.util.Scanner;

public class StringExercise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ile ciag�w znak�w chcesz wprowadzi�?");
		int numberOfIterations = sc.nextInt();
		sc.nextLine();
		String tmp;
		StringBuilder napis = new StringBuilder();
		for (int i = 0; i < numberOfIterations; i++) {
			System.out.println("Podaj s�owo: ");
			tmp = sc.nextLine();
			napis.append(tmp.charAt(tmp.length() - 1));
		}
		System.out.println("napis na wyj�ciu: " + napis);

		sc.close();
	}

}
