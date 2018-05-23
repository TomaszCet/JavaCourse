package zadania.MethodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class Names {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tomek","Bolek","Romek","Natalia","Kanalia");
        Collections.sort(names,String::compareToIgnoreCase);
        show(names,System.out::println);
    }

    public static <T> void show(List<T> list, Consumer <T> consumer){
        for ( T t : list ) {
            consumer.accept(t);

        }
    }
}
