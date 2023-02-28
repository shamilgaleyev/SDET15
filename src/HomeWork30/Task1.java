package HomeWork30;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        /*
        Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Retrieve all keys and values from a Best Buy map using EntrySet.

         */

        Map<Integer, String> bBS = new HashMap<>();
        bBS.put(11111, "Iphone");
        bBS.put(22222, "Printer");
        bBS.put(33333, "Laptop");
        bBS.put(44444, "TV");

        Set<Map.Entry<Integer, String>> entrySet = bBS.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}