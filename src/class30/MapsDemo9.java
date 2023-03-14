package class30;

import java.util.Map;
import java.util.TreeMap;

public class MapsDemo9 {
    public static void main(String[] args) {
        /*
        Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.
         */
        Map<String, String> contries = new TreeMap<>();
        contries.put("USA", "Washington DC");
        contries.put("Canada", "Toronto");
        contries.put("Mexico", "Mexico City");
        contries.put("Cuba", "Gavan");

        var values = contries.values();
        for(var x:values){
            System.out.println(x);
        }
        var entrySet1=contries.entrySet();
        for(var entry: entrySet1){
            System.out.println(entry.getValue().toUpperCase());
        }

        var iterator = contries.values().iterator();
        while (iterator.hasNext()){
           var valuev = iterator.next();
            System.out.println();
        }

    }
}