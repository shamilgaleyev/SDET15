package HomeWork30;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Task5 {
    public static void main(String[] args) {
       /*
       Create a collection of integers in which you can keep duplicates.
        Write a logic to find sum of all integers
        */
        Collection<Integer> numbers  = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(5);
        numbers.add(7);
        numbers.add(5);
        numbers.add(7);
        int sum = 0;
       for (Integer x: numbers){
           sum += x;
       }
        System.out.println(sum);
    }
}
