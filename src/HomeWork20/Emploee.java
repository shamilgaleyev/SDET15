package HomeWork20;

public class Emploee {
    /*
    Create an Employee class that will have variables and methods.
    Constructor that should initialize instance variables
Create 2 subclasses FullTime and PartTime Employees that should have own variables and methods.
Create a Tester Subclass from FullTime Employee and add some features and methods to the Tester Class.
Test your code!
     */
    String name;
    int iD;


    Emploee(String name,int iD){
        this.name = name;
        this.iD = iD;
    }

}
class FullTime extends Emploee {
    int perHour;

    FullTime(String name, int iD,int perHour ) {
        super(name, iD);
        this.perHour = perHour;
    }

    void work1(){
        System.out.println( super.name + " work 40 hours per week");

    }

}
class PartTime extends Emploee {


    PartTime(String name, int iD) {
        super(name, iD);
    }
    void work2(){
        System.out.println( super.name + " work less than 40 hours per week");

    }

}
class Tester extends FullTime {
    int hours;
    Tester(String name, int iD, int perHour, int hours) {
        super(name, iD, perHour);
        this.hours = hours;

    }

    void salary(){
        System.out.println(name + " " + iD + " has a salary per week " + (perHour * hours));
    }

    public static void main(String[] args) {
        Tester emploee = new Tester("Johnson",123,100,40);
        emploee.salary();

    }
}
