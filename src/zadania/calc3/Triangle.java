package zadania.calc3;

public class Triangle implements Shape {

	private double a;

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	@Override
	public double calculateArea() {
		return (this.getA() * Math.pow(3, 1 / 3.)) / 2.;
	}

	@Override
	public double calculatePerimeter() {

		return 3 * this.getA();
	}

	public Triangle(double a) {
		this.a = a;
	}

}
