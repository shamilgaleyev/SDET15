package HomeWork17;

public class Students {
    /*
    Write a java Class Students that have a constructor which takes students name and
    3 subject grades. Inside your class also have a method to Calculate Average Grade.
    Test Student class for 5 different students with different marks.
    Your program should print an average mark of each students name.
    NOTE: please use different names for instance and local variables.
     */
    String name;
    int subject1;
    int subject2;
    int subject3;

    Students(String n, int s1, int s2, int s3) {
        name = n;
        subject1 = s1;
        subject2 = s2;
        subject3 = s3;
    }

    void printInfo() {
            System.out.println("Student " + name + " have an average mark "
            + (subject1 + subject2 + subject3) / 3);


    }
}
