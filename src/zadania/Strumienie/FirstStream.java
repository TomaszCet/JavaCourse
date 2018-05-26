package zadania.Strumienie;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstStream {
    public static void main(String[] args) {
        Stream<Integer> naturalNumbers = Stream.iterate(0,x -> x+1);

        List<Integer> result;
        List<Integer> resultToPrint;
        result = naturalNumbers.filter(x -> x%5 ==0 )
                .filter(x -> x > 100)
                .limit(1000)
                .collect(Collectors.toCollection(ArrayList::new));
        resultToPrint = result.subList(0,11);
        resultToPrint.forEach(x ->System.out.println(x*3));

        System.out.println();
//        all in one
        List<Integer> numbers = Stream.iterate(0, x -> x+1)
                .filter(x -> x>100 && x<1000 && x%5 ==0)
                .limit(10)
                .map(x -> x*3)
                .collect(Collectors.toList());
        numbers.forEach(System.out::println);
    }

}
