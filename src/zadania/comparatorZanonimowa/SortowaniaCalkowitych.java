package zadania.comparatorZanonimowa;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class SortowaniaCalkowitych {



    public static void main(String[] args) {
        Integer[] tabNaturalnych = new Integer[20];
        Random rand = new Random();
        for (int i = 0; i < tabNaturalnych.length; i++) tabNaturalnych[i] = rand.nextInt(100);

        System.out.println("Random");
        System.out.println(Arrays.toString(tabNaturalnych));
        Arrays.sort(tabNaturalnych);
        System.out.println("\nRosnąco:");
        print(tabNaturalnych);


        Arrays.sort(tabNaturalnych,new Comparator<Integer>(){

            @Override
            public int compare(Integer o1, Integer o2) {
                return -(o1.compareTo(o2));
            }
        });
        System.out.println("\nMalejąco:");
        print(tabNaturalnych);

    }
    private static void print(Integer[] array){
        for (Integer i: array
             ) {
            System.out.print(i.toString() + " ");
        }
    }

}
