package review10;

import java.util.HashMap;
import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,Double> groceries = new HashMap<>();
        groceries.put("Milk",5.99);
        groceries.put("Eggs",6.50);
        groceries.put("Bread",2.99);
        groceries.put("Tea",4.99);
        groceries.put("Cucumber",2.50);
        groceries.put("Eggs",7.99);
        groceries.put("Tomato",2.50);

        double teaPrice = groceries.get("Tea");
        System.out.println(teaPrice);

        System.out.println(groceries);


        int size = groceries.size();
        System.out.println(size);

        Map<String,Double> lmap = new LinkedHashMap<>();
        lmap.put("Milk",5.99);
        lmap.put("Eggs",6.50);
        lmap.put("Bread",2.99);
        lmap.put("Tea",4.99);
        lmap.put("Cucumber",2.50);
        lmap.put("Eggs",7.99);
        lmap.put("Tomato",2.50);

        System.out.println(lmap);


        Map<String,Double> tmap = new TreeMap<>();
        tmap.putAll(groceries);
        tmap.putAll(lmap);
        System.out.println(tmap.size());
        System.out.println(tmap);
    }
}
