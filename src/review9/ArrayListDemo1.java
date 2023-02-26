package review9;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        List<String> comp = new ArrayList<>();
        comp.add("Mac");
        comp.add("HP");
        comp.add("Lenovo");
        comp.add("Dell");
        System.out.println(comp);

        for (int i = 0; i < comp.size(); i++) {
            String s = comp.get(i);
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println("____________________");

        for(String x: comp){
            System.out.print(x + " ");
        }


    }
}
