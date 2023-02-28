package HomeWork29;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Task2 {


    public static void main(String[] args) {
        /*
        Create a Set collection that will hold Objects of Student Type.
         In this set we do not care about the insertion order.
          Each student object should have name and studentID. Display name of each student.
         */
//        HashMap<String,Integer> students = new HashMap<>();
//        students.put("John",111);
//        students.put("Chris",222);
//        students.put("Zack",333);
//        students.put("Matt",444);
//        students.put("Amanda",555);
//        System.out.println(students);
//        System.out.println(students.keySet());

        //HashSet<Student> students = new HashSet<>();
        Set<Student> students = new HashSet<>();
         students.add(new Student("John",111));
         students.add(new Student("Chris",222));
         students.add(new Student("Zack",333));
         students.add(new Student("Matt",444));
         for(Student x: students){
             System.out.println(x.getName());
         }

    }
}
class Student{
    private String name;
    private int studentID;

    public Student(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public int getStudentID() {
        return studentID;
    }
}