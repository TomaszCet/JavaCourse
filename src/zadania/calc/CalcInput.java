package zadania.calc;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class CalcInput {
//	profesjonalnie zrobi� to na sta�ych
	final static String PLUS = "+";
	final static String MINUS = "-";
	final static String MULTIPLY = "*";
	final static String DIVIDE = "/";

	public static void main(String[] args) {

		//

		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.US);
		

		double firstNumber;
		String dzialanie;
		double SecondNumber;
		try {
			System.out.println("Podaj pierwsz� liczb�:");
			firstNumber = input.nextDouble();
			System.out.println("Podaj znak dzia�ania (+,-,*,/):");
			input.nextLine();
			dzialanie = input.nextLine();
			System.out.println("Podaj drug� liczb�:");
			SecondNumber = input.nextDouble();
			switchCalculatorOption(firstNumber, dzialanie, SecondNumber);
		} catch (InputMismatchException ex) {
			System.err.println("Wprowadzi�e� z�� warto��");
			System.err.println(ex.getMessage());
		} finally {
			input.close();
		}

	}

	private static void switchCalculatorOption(double firstNumber, String dzialanie, double SecondNumber) {
		String wynik;
		switch (dzialanie) {
		case PLUS:
			wynik = Calculator.add(firstNumber, SecondNumber);
			System.out.println(wynik);
			break;
		case MINUS:
			wynik = Calculator.subtract(firstNumber, SecondNumber);
			System.out.println(wynik);
			break;
		case MULTIPLY:
			wynik = Calculator.multiply(firstNumber, SecondNumber);
			System.out.println(wynik);
			break;
		case DIVIDE:
			wynik = Calculator.divide(firstNumber, SecondNumber);
			System.out.println(wynik);
			break;
		default:
			throw new InputMismatchException("z�y znak dzia�ania");
		}
	}

}
