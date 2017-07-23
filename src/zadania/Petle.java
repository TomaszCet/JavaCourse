package zadania;

import java.util.Scanner;

import jdk.internal.util.xml.impl.Input;

public class Petle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ile liczb chcesz zsumowaæ?");
		int numberOfNumbers = input.nextInt();
		double sum = 0;
		
		for (int i = 0; i < numberOfNumbers; i++) {
			System.out.println("Podaj liczbê do zsumowania");
			double tmp= input.nextDouble();
			sum+= tmp;
		}
		
		System.out.println("Suma liczb to: "+ sum);
		
		input.close();  //zamkniêcie Scannera
	}
	
}
