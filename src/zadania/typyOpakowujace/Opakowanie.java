package zadania.typyOpakowujace;

import java.io.*;
import java.math.BigInteger;

public class Opakowanie {

    public static void main(String[] args) {
        String fileName = "liczby.txt";
        File f = new File(fileName);
        makeFile(f);

        try(
        FileReader fileReader = new FileReader(f);
        BufferedReader reader = new BufferedReader(fileReader);
            ) {
            String str1 = reader.readLine();
            String str2 = reader.readLine();
            String str3 = reader.readLine();
            String str4 = reader.readLine();
            String str5 = reader.readLine();

            int num1 = Integer.parseInt(str1);
            int num2 = Integer.parseInt(str2);
            int num3 = Integer.parseInt(str3);
            BigInteger bigInt1 = new BigInteger(str4);
            BigInteger bigInt2 = new BigInteger(str5);

            System.out.println("Suma 1 " + (num1+num2+num3));
            System.out.println("Suma 2 " + (bigInt1.add(bigInt2)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static void makeFile(File file) {

        try (FileWriter fileWriter = new FileWriter(file);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)){
            bufferedWriter.write("123");
            bufferedWriter.newLine();
            bufferedWriter.write("1234");
            bufferedWriter.newLine();
            bufferedWriter.write("12345");
            bufferedWriter.newLine();
            bufferedWriter.write("123456789123456789");
            bufferedWriter.newLine();
            bufferedWriter.write("987654321987654321");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
