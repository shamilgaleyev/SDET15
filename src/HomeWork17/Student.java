package HomeWork17;

public class Student {
    /*
    Write a Student class   that have instance variables name and address.
     Create a constructor that will initialize those variables.
      Print name & address of given  student using displayInfo method.
     */

    String name;
    String address;

    Student(String stName, String stAddress) {
        name = stName;
        address = stAddress;
    }

    void displayInfo() {
        System.out.println("Student name " + name + ", address: " + address);
    }

    public static void main(String[] args) {


        Student student = new Student("John Smith", "123 Street st.");
        student.displayInfo();

    }
}