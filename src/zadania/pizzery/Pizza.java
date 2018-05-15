package zadania.pizzery;

public enum Pizza {
	MARGHERITA("sos pomidorowy", "ser", ""), CAPRICIOSA("sos pomidorowy", "ser",
			"pieczarki"), PROSCIUTTO("sos pomidorowy", "ser", "szynka");

	private String skl1, skl2, skl3;

	private Pizza(String skl1, String skl2, String skl3) {
		this.skl1 = skl1;
		this.skl2 = skl2;
		this.skl3 = skl3;
	}

	public String getDescription() {
		return "Skladniki: " + skl1 + ", " + skl2 + ", " + skl3;
	}

	public String getSkl1() {
		return skl1;
	}

	public void setSkl1(String skl1) {
		this.skl1 = skl1;
	}

	public String getSkl2() {
		return skl2;
	}
// nie wiedzia³em, ¿e mo¿na tak. Przydatne w sumie do tego rozwi¹zania co w kursie
	public String toString() {
		return "niby mo¿na ale po co?!";
	}
}
