package zadania.calc;

public class Calculator {

//	Klasa wykorzystywana w dwóch programach
	public static String add(double x, double y) {
		double wynik = x + y;
		return "Dodawanie: " + x + " + " + y + " = " + wynik;
	}

	public static String add(double x, double y, double z) {
		double wynik = x + y + z;
		return "Dodawanie: " + x + " + " + y + " + " + z + " = " + wynik;
	}

	public static String subtract(double x, double y) {
		double wynik = x - y;
		return "Odejmowanie: " + x + " - " + y + " = " + wynik;
	}

	public static String subtract(double x, double y, double z) {
		double wynik = x - y - z;
		return "Odejmowanie: " + x + " - " + y + " - " + z + " = " + wynik;
	}

	public static String multiply(double x, double y) {
		double wynik = x * y;
		return "Mno¿enie: " + x + " * " + y + " = " + wynik;
	}

	public static String divide(double x, double y) {
		double wynik = x / y;
		return "Dzielenie: " + x + " / " + y + " = " + wynik;
	}
}
