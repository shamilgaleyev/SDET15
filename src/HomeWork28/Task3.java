package HomeWork28;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        //Create an arrayList of words. Remove every word that ends with āeā.
        ArrayList<String> words = new ArrayList<>();
        words.add("Sky");
        words.add("Cloud");
        words.add("Sun");
        words.add("Moon");
        words.add("Apple");

        words.removeIf(x->x.endsWith("e"));
        System.out.println(words);

//        for(String x: words){
//            if(x.endsWith("e")){
//
//            }else {
//                System.out.print(x+ " ");
//            }
        //}
    }
}
