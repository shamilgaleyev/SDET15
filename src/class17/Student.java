package class17;

public class Student {
    String name;
    String id;
    int age;
    double weight;

    public Student(String sName, int sAge, String sId ){
        name = sName;
        age = sAge;
        id = sId;

    }


    Student(String nameOfStudent, String idOfStudent, int ageOfStudent, double weightOfStudent) {
        name = nameOfStudent;
        id = idOfStudent;
        age = ageOfStudent;
        weight = weightOfStudent;
    }

    void printInfo() {
        System.out.println("Name: " + name + ", Id: "
                + id + ", Age: " + age + ", Weight: " + weight);
    }
}