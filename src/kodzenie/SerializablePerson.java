package kodzenie;

import java.io.Serializable;

public class SerializablePerson implements Serializable{
	private static final long serialVersionUID = 3812017177088226528L;
    
    private String firstName;
    private String lastName;
     
    public String getFirstName() {
        return firstName;
    }
 
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
 
    public String getLastName() {
        return lastName;
    }
 
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
     
    public SerializablePerson(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }

}

//klasa implementuje interfejs Serializable. Dzi?ki temu wszystkie pola typ?w prostych i napisy typu String zostan? zapisane do pliku. 
//Je?eli klasa jest bardziej z?o?ona i zawiera r?wnie? pola innych typ?w referencyjnych, to klasy, kt?re je definiuj? tak?e musz? 
//implementowa? interfejs Serializable. sta?a serialVersionUID jest elementem opcjonalnym, kt?ry pozwala na wersjonowanie klas. 
//Jest ona generowana domy?lnie przez kompilator na podstawie kilku element?w jak nazwa klasy i pola w niej zawarte. 
//Dlatego je?li zapiszesz jaki? obiekt, nast?pnie w klasie Person dodasz nowe pole, nawet prywatne, to pr?ba odczytu obiektu z 
//wcze?niej utworzonego pliku b?dzie niemo?liwa. Wygenerowanie samodzielnie sta?ej serialVersionUID pozwoli zachowa? kompatybilno?? wsteczn?.