package zadania.set;

import java.io.*;
import java.util.Scanner;
import java.util.TreeSet;

public class NamesSet {
    public static void main(String[] args) {
        File f = new File("namespl.txt");
        TreeSet<String> names = new TreeSet<>((o1, o2) -> -(o1.compareTo(o2)));
        try (Scanner sc = new Scanner(f)) {
            while (sc.hasNextLine()){
                names.add(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Liczba imion: " + names.size()
                + ", pierwszy element: " + names.first()
                + ", ostatni element: "+ names.last());

    }
}
