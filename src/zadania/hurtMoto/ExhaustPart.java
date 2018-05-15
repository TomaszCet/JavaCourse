package zadania.hurtMoto;

public class ExhaustPart extends Part {

	private boolean zgodnaZEuStandard;

	public boolean isZgodnaZEuStandard() {
		return zgodnaZEuStandard;
	}

	public void setZgodnaZEuStandard(boolean zgodnaZEuStandard) {
		this.zgodnaZEuStandard = zgodnaZEuStandard;
	}

	public ExhaustPart(int id, String model, String marka, String seria, boolean zgodnaZEuStandard) {
		super(id, model, marka, seria);
		this.zgodnaZEuStandard = zgodnaZEuStandard;
	}

	@Override
	public String toString() {
		return "ExhaustPart [id=" + this.getId() + ", model=" + this.getModel() + ", marka=" + this.getMarka() + ", seria=" + this.getSeria() +", zgodnaZEuStandard=" + zgodnaZEuStandard + "]";
	} 
}
