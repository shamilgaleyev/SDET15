package class30;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapsDemo8 {
    public static void main(String[] args) {
        /*
        Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.
         */
        Map<String,String> contries = new TreeMap<>();
        contries.put("USA","Washington DC");
        contries.put("Canada","Toronto");
        contries.put("Mexico","Mexico City");
        contries.put("Cuba", "Gavan");

        //Set<Map.Entry<String,String>> c = contries.entrySet();
        var c = contries.entrySet();
        for(var x: c) {
            System.out.println(x.getKey() + " " + x.getValue());
        }
        var iterator = contries.entrySet().iterator();
        while (iterator.hasNext()){
            var entry = iterator.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
