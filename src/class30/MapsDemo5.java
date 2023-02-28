package class30;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapsDemo5 {
    public static void main(String[] args) {
        Map<Integer,String> students = new HashMap<>();

        students.put(1,"Nezir");
        students.put(2,"Shah");
        students.put(3,"Tami");
        students.put(4,"Aisha");
        students.put(5,"Aisha");
        students.put(6,"Aisha");
        students.put(7,"Aisha");

        Set<Integer> st = students.keySet();
        st.removeIf(x->x>2);
        System.out.println(st);
        System.out.println(students);



    }
}
