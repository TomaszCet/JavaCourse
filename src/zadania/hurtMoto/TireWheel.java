package zadania.hurtMoto;

public class TireWheel extends Part {

	private int rozmiarKola;

	public int getRozmiarKola() {
		return rozmiarKola;
	}

	public void setRozmiarKola(int rozmiarKola) {
		this.rozmiarKola = rozmiarKola;
	}

	public int getSzerokośćKola() {
		return szerokośćKola;
	}

	public void setSzerokośćKola(int szerokośćKola) {
		this.szerokośćKola = szerokośćKola;
	}

	private int szerokośćKola;

	public TireWheel(int id, String model, String marka, String seria, int rozmiarKola, int szerokośćKola) {
		super(id, model, marka, seria);
		this.rozmiarKola = rozmiarKola;
		this.szerokośćKola = szerokośćKola;
	}

	@Override
	public String toString() {
		return "TireWheel [id=" + this.getId() + ", model=" + this.getModel() + ", marka=" + this.getMarka() + ", seria=" + this.getSeria() + ". rozmiarKola=" + rozmiarKola + ", szerokośćKola=" + szerokośćKola + "]";
	}
}
