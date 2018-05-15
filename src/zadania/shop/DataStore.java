package zadania.shop;

public class DataStore {
	Computer notebooks[];
	public static final int MAX_COMPUTERS = 100;
	private int numberOfComputers;

	public Computer[] getComputers() {
        Computer[] comps = new Computer[numberOfComputers];
        for (int i = 0; i < numberOfComputers; i++) {
            comps[i] = notebooks[i];
        }
        return comps;
    }
 
    public void setComputers(Computer[] computers) {
        this.notebooks = computers;
    }
    public  int getNumberOfComputers() {
		return numberOfComputers;
	}
	public  void setNumberOfComputers(int numberOfComputers) {
		this.numberOfComputers = numberOfComputers;
	}
	public DataStore() {
		notebooks = new Computer[MAX_COMPUTERS];
		numberOfComputers = 0;
	}
	public DataStore( int maxComputers) {
		notebooks = new Computer[maxComputers];
		numberOfComputers = 0;
	}

	public void add(String producer, int model) {
		if (numberOfComputers < notebooks.length) {
			notebooks[numberOfComputers] = new Computer(producer, model);
			numberOfComputers++;
		}
	}

	public int checkAwailability(Computer computer) {
		int computersInShop = 0;
		for (int i = 0; i < numberOfComputers; i++) {
			if (notebooks[i].equals(computer)) {
				computersInShop++;
			}
		}
		return computersInShop;
	}
	
	

}
