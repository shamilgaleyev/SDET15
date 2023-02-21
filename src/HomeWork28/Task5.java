package HomeWork28;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.ListIterator;

public class Task5 {
    public static void main(String[] args) {
     //Create an arrayList of even numbers from 1 to 500.
     // Remove any number that is divisible by 5 from that arrayList.

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 2; i <= 500; i+=2) {
            numbers.add(i);
        }
        ListIterator<Integer> iterator = numbers.listIterator();
        while (iterator.hasNext()){
             Integer i= iterator.next();
            if(i%5 == 0){
                iterator.remove();

            }
        }
        System.out.print(numbers);
    }
}
