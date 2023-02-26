package class29;

import java.awt.geom.QuadCurve2D;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {
    public static void main(String[] args) {
        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(10.0);
        numbers.add(15.2);
        numbers.add(20.0);
        numbers.add(30.5);
        numbers.add(40.5);
        numbers.add(10.3);

       // numbers.removeIf(x -> x > 11);

       Iterator<Double> it = numbers.iterator();

//        System.out.println(it.hasNext());
//        System.out.println(it.next());
//        System.out.println(it.hasNext());
//        System.out.println(it.next());
        while (it.hasNext()){
           double n = it.next();
           if(n>11){
               it.remove();
           }
        }
        System.out.println(numbers);


    }


}
