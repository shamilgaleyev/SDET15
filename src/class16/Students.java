package class16;

public class Students {
    /*
    Create a Class called Students
Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students
     */
    String name;
    String ID;
    static int numberOfStudents = 0;

    public static void main(String[] args) {
        Students per1 = new Students();
        per1.name = "John";
        per1.ID = "1";
        per1.numberOfStudents++;

        Students per2 = new Students();
        per2.name = "John";
        per2.ID = "1";
        per2.numberOfStudents++;

        Students per3 = new Students();
        per3.name = "John";
        per3.ID = "1";
        per3.numberOfStudents++;

        System.out.println(Students.numberOfStudents);
    }

}