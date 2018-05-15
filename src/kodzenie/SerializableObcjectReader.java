package kodzenie;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

//Utworzenie obiektów FileInputStream i ObjectInputStream jest analogiczne do obiektów zapisuj¹cych dane. 
//Zauwa¿, ¿e odczytuj¹c dane za pomoc¹ metody readObject() otrzymujemy zawsze obiekt klasy Object -
//wymagane jest jego rzutowanie na odpowiedni typ. Jednoczeœnie metoda ta generuje kontrolowany wyj¹tek ClassNotFoundException, 
//który musi byæ obs³u¿ony lub zadeklarowany za pomoc¹ throws.

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

//WeŸ pod uwagê, ¿e mechanizm serializacji wymaga, aby w nadklasie by³ zdefiniowany konstruktor bez argumentów. 
//W naszym przypadku je¿eli próbowalibyœmy zdefiniowaæ klasê Employee (pracownik) dziedzicz¹c¹ po Person, to w poni¿szej sytuacji otrzymamy b³¹d:
//
//import java.io.Serializable;
// 
//public class Employee extends Person implements Serializable {
//     
//}
//
//poniewa¿ klasa Person nie posiada konstruktora bez parametrów (ani domyœlnego, bo zdefiniowany jest konstruktor z 2 parametrami). 
//W celu jego wyeliminowania w klasie Person nale¿¹³oby zdefiniowaæ konstruktor, który nie musi nic robiæ:
//	
//public Person(){}


//Serializacja a dziedziczenie
//
//Je¿eli korzystamy z dobrodziejstw jakie daje nam dziedziczenie to nale¿y wiedzieæ, ¿e jeœli jakaœ klasa implementuje interfejs Serializable, 
//to mo¿liwoœæ serializacji bêd¹ mia³y tak¿e wszystkie podklasy w hierarchii dziedziczenia.
//
//Warto te¿ pamiêtaæ, ¿e jeœli rozszerzamy klasê, która nie implementuje interfejsu Serializable, 
//a podklasa tak, to serializacji podlegaj¹ tylko pola z podklasy, pozosta³e informacje zostan¹ utracone.