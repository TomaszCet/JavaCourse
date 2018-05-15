package kodzenie;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class OdczytZapisPlikow {

	public static void main(String[] args) throws FileNotFoundException {
		// Scanner
		String fileName = "testFile.txt";
		File file = new File(fileName);
		Scanner scan = new Scanner(file);

		int lines = 0;
		while (scan.hasNextLine()) {
			String name = scan.nextLine();
			System.out.println(name);
			lines++;
		}
		System.out.println("Iloœæ wierszy w pliku: " + lines);
		scan.close();

		// BufferedReader & try with resources
		fileName = "testFile1.txt";
		FileReader fileReader = null;
		BufferedReader reader = null;
		try {
			fileReader = new FileReader(fileName);
			reader = new BufferedReader(fileReader);
			String nextLine = null;
			lines = 0;
			while ((nextLine = reader.readLine()) != null) {
				System.out.println(nextLine);
				lines++;
			}
			System.out.println("Iloœæ wierszy w pliku: " + lines);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null)
					reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		// BufferedWriter

		fileName = "testFile3.txt";
		try (FileWriter fileWriter = new FileWriter(fileName);
				BufferedWriter writer = new BufferedWriter(fileWriter);) {
			writer.write("Bolek");
			writer.newLine();
			writer.write("Lolek");
			writer.newLine();
			writer.write("Karolek");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
