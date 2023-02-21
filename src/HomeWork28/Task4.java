package HomeWork28;

import java.util.ArrayList;
import java.util.ListIterator;

public class Task4 {
    public static void main(String[] args) {
        /*
        Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
         */
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Juice");
        drinks.add("Soda");
        drinks.add("Lemonade");
        drinks.add("Tea");
        drinks.add("Coffee");

        ListIterator<String> iterator=drinks.listIterator();

        while (iterator.hasNext()){
            String s= iterator.next();
            if(s.contains("a")||s.contains("e")){
                iterator.remove();
                iterator.add("Water");
            }
        }
        System.out.println(drinks);




    }
}
