package zadania.calc;

import java.util.Locale;
import java.util.Scanner;

public class CalcInput {

	public static void main(String[] args) {
		
//		profesjonalnie zrobiæ to na sta³ych
		final String PLUS = "+";
	    final String MINUS = "-";
	    final String MULTIPLY = "*";
	    final String DIVIDE = "/";
		
		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.US);
		String wynik;
		System.out.println("Podaj pierwsz¹ liczbê:");
		
		double firstNumber=input.nextDouble();
		System.out.println("Podaj znak dzia³ania (+,-,*,/):");
		input.nextLine();
		String dzialanie = input.nextLine();
		System.out.println("Podaj drug¹ liczbê:");
		double SecondNumber=input.nextDouble();
		switch (dzialanie) {
		case PLUS:
			wynik=Calculator.add(firstNumber, SecondNumber);
			System.out.println(wynik);
			break;
		case MINUS:
			wynik=Calculator.subtract(firstNumber, SecondNumber);
			System.out.println(wynik);
			break;
		case MULTIPLY:
			wynik=Calculator.multiply(firstNumber, SecondNumber);
			System.out.println(wynik);
			break;
		case DIVIDE:
			wynik=Calculator.divide(firstNumber, SecondNumber);
			System.out.println(wynik);
			break;
		default:
			System.out.println("Poda³eœ z³y znak :(");
		}
		
		input.close();
	}

}
