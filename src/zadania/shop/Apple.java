package zadania.shop;

public class Apple extends Fruit {
	private String odmiana;

	public String getOdmiana() {
		return odmiana;
	}

	public void setOdmiana(String odmiana) {
		this.odmiana = odmiana;
	}

	public Apple(String odmiana) {
		super();
		this.odmiana = odmiana;
	}

	@Override
	public String toString() {
		super.toString();
		return super.toString() + "Apple [odmiana=" + odmiana + "]";
	}
}
