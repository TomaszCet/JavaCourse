package kodzenie;

import java.util.Random;

public class OperacjeNaZmiennych {

	public static void main(String[] args) {
		char letter1 = 'k';
		char letter2 = 'o';
		char letter3 = 't';
		System.out.println("B³êdne \"sumowanie\" znaków");
		System.out.println(letter1 + letter2 + letter3);
		System.out.println("Tekst jawny");
		System.out.println("" + letter1 + letter2 + letter3);
		letter1++;
		letter2++;
		letter3++;
		System.out.println("Tekst zaszyfrowany");
		System.out.println("" + letter1 + letter2 + letter3);
		int wynik = (int) 4.5; // !!!!!!!!!!!!!!!!
		System.out.println(wynik);

		Random rand = new Random();

		int x = rand.nextInt(10), y = rand.nextInt(10);
		System.out.println("x= " + x + ", y= " + y);
		System.out.println(x > y);
		System.out.println(x * 2 > y);
		System.out.println(y < x + 3 && y > x - 2);
		System.out.println((x * y) % 2 == 0);
	}

}
