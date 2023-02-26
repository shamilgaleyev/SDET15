package HomeWork29;

import java.util.HashMap;

public class Task2 {


    public static void main(String[] args) {
        /*
        Create a Set collection that will hold Objects of Student Type.
         In this set we do not care about the insertion order.
          Each student object should have name and studentID. Display name of each student.
         */
        HashMap<String,Integer> students = new HashMap<>();
        students.put("John",111);
        students.put("Chris",222);
        students.put("Zack",333);
        students.put("Matt",444);
        students.put("Amanda",555);
        System.out.println(students);
        System.out.println(students.keySet());
    }
}
