package class30;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapsDem06 {
    public static void main(String[] args) {
        Map<Integer,String> students = new HashMap<>();

        students.put(1,"Nezir");
        students.put(2,"Shah");
        students.put(3,"Tami");
        students.put(4,"Aisha");
        students.put(5,"Gul");
        students.put(6,"Bahar");
        students.put(7,"Saba");

        Collection<String> values = students.values();
        System.out.println(values);
        values.removeIf(x->x.contains("i"));
        System.out.println(values);
        System.out.println(students);
        Collection<Integer> keys = students.keySet();
        keys.removeIf(x->x>2);
        System.out.println(students);
    }
}
