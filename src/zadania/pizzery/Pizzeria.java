package zadania.pizzery;

import java.util.Scanner;

public class Pizzeria {

	public static void main(String[] args) {
		System.out.println("Witaj, jak¹ pizze chcesz zamówiæ?");
//		values()
		for (Pizza pizza : Pizza.values()) {
			System.out.println(pizza.name() + "- " + pizza.getDescription());
		}
//		Scanner
		Scanner sc = new Scanner(System.in);
//		valueOf()
		Pizza order = Pizza.valueOf(sc.nextLine().toUpperCase());
//		name()
		System.out.println("Wybra³eœ pizzê: "+ order.name());
		sc.close();

	}

}
