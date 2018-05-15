package kodzenie;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

//Utworzenie obiekt�w FileInputStream i ObjectInputStream jest analogiczne do obiekt�w zapisuj�cych dane. 
//Zauwa�, �e odczytuj�c dane za pomoc� metody readObject() otrzymujemy zawsze obiekt klasy Object -
//wymagane jest jego rzutowanie na odpowiedni typ. Jednocze�nie metoda ta generuje kontrolowany wyj�tek ClassNotFoundException, 
//kt�ry musi by� obs�u�ony lub zadeklarowany za pomoc� throws.

public class SerializableObcjectReader {
	public static void main(String[] args) {
        String fileName = "person.obj";
         
        SerializablePerson p1 = null;
         
        try(
                FileInputStream fis = new FileInputStream(fileName);
                ObjectInputStream ois = new ObjectInputStream(fis);
                ) {
 
        p1 = (SerializablePerson) ois.readObject();
         
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
         
        if(p1 != null) {
            System.out.println("Wczytano dane o: ");
            System.out.println(p1.getFirstName() + " " + p1.getLastName());
        }
    }
}

//We� pod uwag�, �e mechanizm serializacji wymaga, aby w nadklasie by� zdefiniowany konstruktor bez argument�w. 
//W naszym przypadku je�eli pr�bowaliby�my zdefiniowa� klas� Employee (pracownik) dziedzicz�c� po Person, to w poni�szej sytuacji otrzymamy b��d:
//
//import java.io.Serializable;
// 
//public class Employee extends Person implements Serializable {
//     
//}
//
//poniewa� klasa Person nie posiada konstruktora bez parametr�w (ani domy�lnego, bo zdefiniowany jest konstruktor z 2 parametrami). 
//W celu jego wyeliminowania w klasie Person nale���oby zdefiniowa� konstruktor, kt�ry nie musi nic robi�:
//	
//public Person(){}


//Serializacja a dziedziczenie
//
//Je�eli korzystamy z dobrodziejstw jakie daje nam dziedziczenie to nale�y wiedzie�, �e je�li jaka� klasa implementuje interfejs Serializable, 
//to mo�liwo�� serializacji b�d� mia�y tak�e wszystkie podklasy w hierarchii dziedziczenia.
//
//Warto te� pami�ta�, �e je�li rozszerzamy klas�, kt�ra nie implementuje interfejsu Serializable, 
//a podklasa tak, to serializacji podlegaj� tylko pola z podklasy, pozosta�e informacje zostan� utracone.