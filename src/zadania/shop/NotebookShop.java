package zadania.shop;

public class NotebookShop {

	public static void main(String[] args) {
		DataStore dStore = new DataStore(15);
		dStore.add("HP", 100);
		dStore.add("HP", 100);
		dStore.add("HP", 101);
		dStore.add("Acer", 21);
		dStore.add("Apple", 34234);
		
		System.out.println(dStore.checkAwailability(new Computer("HP", 100)));
		System.out.println(dStore.checkAwailability(new Computer("Acer", 100)));
		for (Computer comp : dStore.getComputers()){
			System.out.println(comp);
		}

	}

}
