package zadania.point2;

import zadania.point.Point;

public class PointApplication {

	public static void main(String[] args) {

		final int ADD_X = 1;
		final int ADD_Y = 2;
		final int MINUS_X = 3;
		final int MINUS_Y = 4;

		Point point1 = new Point();
		Point point2 = new Point(4, 4);
		Point point3 = new Point(7, 4);
		PointController pC = new PointController();
		point1.setX(2);
		point1.setY(6);
		System.out.println(point1);
		pC.addX(point1);
		pC.minusY(point1);
		System.out.println(point1);
		System.out.println();
		System.out.println(point2);
		pC.minusX(point2);
		pC.addY(point2);
		System.out.println(point2);

		// podaj¹c obiekt do metody podajemy jego referencjê,
		// je¿eli byœmy chcieli przypisaæ do tej referencji inny obiekt to nie
		// zadzia³a.
		// Mo¿emy zmieniaæ tylko atrybuty wyjœciowego obiektu !!

		System.out.println();
		int number = 3;
		System.out.println(point3);
		switch (number) {
		case ADD_X:
			pC.addX(point3);
			System.out.println(point3);
			break;
		case ADD_Y:
			pC.addY(point3);
			System.out.println(point3);
			break;
		case MINUS_X:
			pC.minusX(point3);
			System.out.println(point3);
			break;
		case MINUS_Y:
			pC.minusY(point3);
			System.out.println(point3);
			break;
		}
	}

}
