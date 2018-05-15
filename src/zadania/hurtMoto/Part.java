package zadania.hurtMoto;

public class Part {

	private int id;
	private String model;
	private String marka;
	private String seria;

	public int getId() {
		return id;
	}

	public Part(int id, String model, String marka, String seria) {
		super();
		this.id = id;
		this.model = model;
		this.marka = marka;
		this.seria = seria;
	}

	public Part() {
		super();
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getSeria() {
		return seria;
	}

	public void setSeria(String seria) {
		this.seria = seria;
	}

	@Override
	public String toString() {
		return "Part [id=" + this.getId() + ", model=" + this.getModel() + ", marka=" + this.getMarka() + ", seria=" + this.getSeria() + "]";
	}

}
