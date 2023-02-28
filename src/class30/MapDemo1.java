package class30;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<Integer,String>  students = new HashMap<>();

        students.put(1,"Nezir");
        students.put(2,"Shah");
        students.put(3,"Tami");
        students.put(4,"Aisha");

        System.out.println(students);
        System.out.println(students.get(3));
        System.out.println(students.size());
        System.out.println(students.containsKey(2));
        System.out.println(students.containsValue("Aisha"));
        System.out.println(students.remove(1));
        System.out.println(students);
        students.replace(2,"Asly");
        System.out.println(students);
    }
}
