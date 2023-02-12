package class23;

public class StudentTester {
    public static void main(String[] args) {
        Student[] student = {new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};
        for(Student student1: student){
            student1.hardStudy();
        }
    }
}
