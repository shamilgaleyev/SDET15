package HomeWork29;

import java.util.LinkedHashSet;

public class Task1 {
    public static void main(String[] args) {
        /*

         Create a Set of cities in which you want to make sure that insertion order is maintained.
          Then remove any city that starts with “A”;
         */

        LinkedHashSet<String> cities = new LinkedHashSet<>();
        cities.add("Rome");
        cities.add("Madrid");
        cities.add("London");
        cities.add("Amsterdam");

        cities.removeIf(x ->x.startsWith("A"));
        System.out.println(cities);
    }
}
