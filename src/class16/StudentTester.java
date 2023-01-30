package class16;

public class StudentTester {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Zafar";
        student.id = "123";
        student.age = 22;
        student.weight = 70;
       // student.scoolName = "Syntax";

        Student student1 = new Student();
        student1.name = "Hamid";
        student1.id = "456";
        student1.age = 32;
        student1.weight = 80;
       // student1.scoolName = "Syntax";

        Student student2 = new Student();
        student2.name = "Nelson";
        student2.id = "789";
        student2.age = 42;
        student2.weight = 90;
        //student2.scoolName = "Syntax";

        System.out.println(student1.schoolName);
        System.out.println(Student.schoolName);
    }
}
