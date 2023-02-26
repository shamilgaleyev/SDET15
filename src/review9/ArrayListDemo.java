package review9;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> alist = new ArrayList<>();
        alist.add(12);
        alist.add(13);
        alist.add(14);

        int size = alist.size();
        System.out.println(size);

        System.out.println(alist.get(0));
        alist.set(0,120);

        System.out.println(alist.get(0));

        alist.remove(2);
        System.out.println(alist);



    }
}
