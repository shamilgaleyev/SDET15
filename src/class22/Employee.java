package class22;

public class Employee {
    String name;
    static int baseSalary = 100000;
    static int baseHolidays = 10;
    void printSalary(){
        System.out.println(baseSalary);
    }
    void printHoliday(){
        System.out.println(baseHolidays);
    }
}
class OffceBoy extends Employee{

}
class Manager extends Employee{
    void printSalary(){
        System.out.println((baseSalary*2) + 200000);
    }
}
class Developer extends Employee{
    void printSalary(){
        System.out.println(baseSalary*5);
    }
}