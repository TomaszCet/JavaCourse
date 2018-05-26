package zadania.Strumienie;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OperationsOnFile {
    public static void main(String[] args) {
        String fileName = "loremipsum-129.txt";
        File f = new File(fileName);
        Scanner sc = null;
        try {
            sc = new Scanner(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        StringBuffer stringBuffer = new StringBuffer();

        while(sc.hasNextLine()){
            stringBuffer.append(sc.nextLine());
        }

        List<String> wordsList = Arrays.asList(stringBuffer.toString().split(" "));
        Stream<String> stringStream = wordsList.stream();

//        regex! uwaga na znaki specjalne!
        wordsList = stringStream
                .map(x -> x.replaceAll(",","").replaceAll("\\.",""))
                .collect(Collectors.toList());
//        for (String s : wordsList) {
//            System.out.println(s);
//        }

        long piatki = wordsList.stream().filter(x -> x.length() == 5).count();
        System.out.println("liczba pięcioliterowych: "+ piatki);
        long startaWithS = wordsList.stream().filter(x -> x.startsWith("s")).count();
        System.out.println("liczba słów zaczynających się od \"s\": "+ startaWithS);

    }

}
