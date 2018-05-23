package zadania.lambdaExpressions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class FirstLambda {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        Random rand = new Random();
        Supplier<Integer> generator = () ->  rand.nextInt(100);
//        generuj
        for (int i = 0; i <10; i++){
            lista.add(generator.get());
        }
//        wyświetl
//        tworzenie funkcji
        Consumer<Integer> print = x -> System.out.print(x.toString() + " ");
        for (Integer i : lista ) {
            print.accept(i);
        }
        System.out.println();
//        usuń parzyste
        Iterator<Integer> iterator = lista.iterator();
        deleteEven(iterator,x -> x%2 == 0);
//        Print
        for (Integer i : lista ) {
            print.accept(i);
        }
    }
    private static <T> void deleteEven(Iterator<T> iter, Predicate<T> test ){
        while (iter.hasNext()){
            if (test.test(iter.next()) ){
                iter.remove();
            }
        }
    }
}
