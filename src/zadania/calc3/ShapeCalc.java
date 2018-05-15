package zadania.calc3;

import java.util.Locale;
import java.util.Scanner;

public class ShapeCalc {

	public static void main(String[] args) {
		final int CIRCLE = 2;
		final int RECTANGLE = 1;
		final int TRIANGLE = 3;
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		System.out.println("prostok�t=1\nko�o=2\ntr�jk�t=3\n");
		int figureNumber = sc.nextInt();
		sc.nextLine();
		Shape firure;

		switch (figureNumber) {
		case CIRCLE:
			System.out.println("Podaj promie� ko�a");
			int r = sc.nextInt();
			sc.nextLine();
			firure = new Circle(r);
			System.out.println(firure.calculateArea());
			System.out.println(firure.calculatePerimeter());
			break;
		case RECTANGLE:
			System.out.println("Podaj d�ugo�� pierwszego boku");
			int a = sc.nextInt();
			sc.nextLine();
			System.out.println("Podaj d�ugo�� drugiego boku");
			int b = sc.nextInt();
			sc.nextLine();
			firure = new Rectangle(a, b);
			System.out.println(firure.calculateArea());
			System.out.println(firure.calculatePerimeter());
			break;
		case TRIANGLE:
			System.out.println("Podaj d�ugo�� boku tr�jk�ta(r�wnoboczny)");
			int c = sc.nextInt();
			sc.nextLine();
			firure = new Triangle(c);
			System.out.println(firure.calculateArea());
			System.out.println(firure.calculatePerimeter());
			break;
		default:
			System.out.println("co� posz�o nie tak");
			break;
		}
		

		sc.close();
	}
}
