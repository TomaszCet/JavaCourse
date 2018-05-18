package zadania.Array;

import java.util.Objects;

public class Person {
    private String imie;
    private String nazwisko;
    private String pesel;

    @Override
    public String toString() {
        return "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", pesel='" + pesel + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(imie, person.imie) &&
                Objects.equals(nazwisko, person.nazwisko) &&
                Objects.equals(pesel, person.pesel);
    }

    @Override
    public int hashCode() {

        return Objects.hash(imie, nazwisko, pesel);
    }

    public Person(String imie, String nazwisko, String pesel) {

        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
    }
}
