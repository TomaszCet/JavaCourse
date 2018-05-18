package zadania.genericTypes;

public class PairTest {
    public static void main(String[] args) {
        Pair<Integer,Integer> pair1= new Pair<>(2,3);
        Pair<Integer,String> pair2= new Pair<>(2,"foo");
        Pair<String,Boolean> pair3= new Pair<>("test",true);
        System.out.println(pair1.printPair());
        System.out.println(pair2.printPair());
        System.out.println(pair3.printPair());

    }
}
