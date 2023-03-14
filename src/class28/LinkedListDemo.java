package class28;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Artem");
        names.add("Elvira");
        names.add("Tammana");
        names.add("Temmuz");
        names.add("Sam");

        System.out.print(names+ " ");
        System.out.println();

        for (String x :names){
            System.out.print(x + " ");
        }
    }
}
