package HomeWork30;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Person {
        /*
        Create a Person class with following private fields: name, lastName, age, salary.
Variables should be initialized through constructor.
Inside the class also create a method to print user details.
In Test Class create a Map that will store key in ascending order.
In that map store personId and a Person Object. Print each object details.
         */
    private String name,lastName;
    private int age;
    private double salary;

    public Person(String name, String lastName, int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

       public  void printInfo(){
            System.out.println(name+" "+lastName+" "+age+" "+ salary);
        }

}
class Test{
    public static void main(String[] args) {

        Map<Integer,Person> p =new TreeMap<>();
        p.put(1,new Person("John","Johnson",30,140000));
        p.put(2,new Person("Jeff","Jenson",35,140000));
        p.put(3,new Person("Tom","Tomson",40,140000));
        p.put(4,new Person("Clark","Clarkson",45,140000));
        Set<Map.Entry<Integer,Person>> entrySet = p.entrySet();
        for(Map.Entry<Integer,Person> entry: entrySet) {
            System.out.println("User ID "+entry.getKey());
            entry.getValue().printInfo();
        }
    }
}