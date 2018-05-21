package zadania.Kolejki;


import java.util.Comparator;

public enum TaskPriority  {
    LOW(1), MODERATE(2), HIGH(3);

    private int weight;
    private TaskPriority(int weight){
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

}
