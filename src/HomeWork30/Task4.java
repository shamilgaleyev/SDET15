package HomeWork30;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Task4 {
    public static void main(String[] args) {
        /*
Create the collection that will store single uniques Objects of a String type in which order is preserved.
Write a logic to concatenate all string from the collection.
         */
        Collection<String> words = new LinkedHashSet<>();
        words.add("I");
        words.add("will");
        words.add("get");
        words.add("new");
        words.add("job");
        words.add("this");
        words.add("June");

        for (String s: words){
            System.out.print(s + " ");
        }
    }
}
