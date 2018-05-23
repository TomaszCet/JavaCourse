package zadania.CollectionsClass;

import java.util.*;

public class Totolotek {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(49);
        List<Integer> myTry = new ArrayList<>(6);
        generate(numbers);
        List<Integer> winningNumbers = randomize(numbers);

        checkResults(myTry, winningNumbers);
    }

    private static void checkResults(List<Integer> myTry, List<Integer> winningNumbers) {
        for (int i = 0; i<6;i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Podaj liczbę: ");
            myTry.add(sc.nextInt());
            sc.nextLine();
        }
        int counter=0;
        for (Integer i: myTry ) {
            if (winningNumbers.contains(i)) counter++;
        }
        if (counter == 6){
            System.out.println("Gratulacje! Wygrałeś główną nagrodę");
        }else{
            System.out.println("Niestety. Trafiłeś " + counter + " z 6 liczb. Spróbuj jutro!");
            System.out.println("Szczęśliwe Liczby to:");
            for (Integer i : winningNumbers){
                System.out.print(i.toString() + " ");
            }

        }
    }

    private static List<Integer> randomize(List<Integer> numbers) {
        Collections.shuffle(numbers);
        List<Integer> winningNumber = numbers.subList(0,6);
        return winningNumber;
    }

    private static void generate(List<Integer> numbers) {
        for(int i = 1;i<=49; i++){
            numbers.add(i);
        }
    }
}
