package zadania.Iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class FirstIterator {
    public static void main(String[] args) {
        Map<String,Integer> peopleMap = new TreeMap<>();
        peopleMap.put("Cetnar Tomasz", 32);
        peopleMap.put("Dupa Tomasz", 52);
        peopleMap.put("Kwaśna Tomasz", 22);
        peopleMap.put("Abecadło Tomasz", 34);
        peopleMap.put("Beczka Tomasz", 42);
        peopleMap.put("Krowa Tomasz", 12);

        Iterator<String> iterator = peopleMap.keySet().iterator();
        while (iterator.hasNext()){
            String tmp = iterator.next();
            System.out.println(tmp + " " + peopleMap.get(tmp));
        }
    }
}
