package zadania.hurtMoto;

public class TestClass {
	
	public static void main(String[] args) {
		Part part =new Part();
		TireWheel tire = new TireWheel(0, "astra", "Opel", "2", 19, 12);
		ExhaustPart exhaust =new ExhaustPart(2, "Civiv", "Honda", "2011", true);
		System.out.println(part);
		System.out.println(tire);
		System.out.println(exhaust);
	}
}
