package class29;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Task5 {
    public static void main(String[] args) {
        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        //How can you remove all duplicates from ArrayList?
        TreeSet<String> tr = new TreeSet<>(aList);
        System.out.println(tr);
    }
}
