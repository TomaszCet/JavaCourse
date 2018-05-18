package zadania.Array;

import java.util.Arrays;

public class PersonDatabase {
    public Person[] people;

    /* Refactoring
    * Dodać pole trzymające wartość na którą można obecnie zapisać
    * np nextFree */

    public PersonDatabase(int size) {
        this.people = new Person[size];
    }

    public void add(Person p){
        Person[] tmp;
        for(int i = 0; i <= people.length; i++){
            if(i == people.length){
                people = Arrays.copyOf(people,(people.length)*2);
            }
            if (people[i] == null){
                people[i] = p;
                break;
            }
        }
    }

    public void remove(Person person){
        for (int i = 0; i < people.length; i++) {
            if (people[i] != null && people[i].equals(person)){
                System.arraycopy(people, i+1, people,i,people.length-i-1);
            }

        }
    }

    public Person get(int i){
        if ( 0>= i && i >= people.length){
            return null;
        } else {
            return people[i];
        }
    }

    public int size(){
        int counter = 0;
        for (Person person :people ) {
            if (person != null){
                counter++;
            }
        }
        return counter;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PersonsDatabase: " );
        sb.append("\n");
        for (int i = 0; i < people.length; i++) {
            if (people[i] != null){
                sb.append(people[i].toString());
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
