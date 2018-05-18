package zadania.Rekurencja;

public class Rekurenacja {
    public static void main(String[] args) {
        int n_number = 6;
        System.out.println(silnia(n_number));
        System.out.println(silnia2(n_number));
    }

// z operatorem trójargumentowym
    public static int silnia(int n){
        return n>1 ? n*silnia(n-1) : n;
    }

// z ifem
    public static int silnia2(int n){
        if(n>1){
            return n*silnia(n-1);
        } else {
            return n;
        }
    }

}
