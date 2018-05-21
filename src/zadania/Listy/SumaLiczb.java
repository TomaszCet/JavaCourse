package zadania.Listy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Refactoring
* by było bardziej idioto odporne
* dodać exit i pobierać nextLine w try-catch*/
public class SumaLiczb {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        addToList(scan, list);
        System.out.println(printSum(list));
    }

    private static void addToList(Scanner scan, List<Integer> list) {
        int liczba;
        System.out.print("Podaj liczbę ");
        liczba = scan.nextInt();
        if (liczba != 0) {
            list.add(liczba);
            addToList(scan,list);
        }
    }

    private static String printSum(List<Integer> list){
        StringBuilder stringBuilder = new StringBuilder();
        int sum = 0;
        for (Integer i : list
             ) {
            stringBuilder.append(i + " + ");
            sum+=i;
        }
        stringBuilder.replace(stringBuilder.length()-3,stringBuilder.length()+1," = "+sum);

        return  stringBuilder.toString();
    }
}
