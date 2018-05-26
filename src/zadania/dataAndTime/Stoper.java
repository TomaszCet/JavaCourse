package zadania.dataAndTime;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Stoper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Instant beginning,end;

        System.out.print("Aby rozpocząć wciśnij ENTER: ");
        sc.nextLine();
        beginning = Instant.now();
        System.out.print("Aby zakończyć pomiar wciśnij ENTER: ");
        sc.nextLine();
        end = Instant.now();

        System.out.println("Zmiarzony czas to: " + Duration.between(beginning,end).getSeconds() + " sekund");

    }
}
