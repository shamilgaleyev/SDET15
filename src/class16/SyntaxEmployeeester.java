package class16;

public class SyntaxEmployeeester {

    public static void main(String[] args) {
        SyntaxEmployee person1 = new SyntaxEmployee();
        person1.empID = "111";
        person1.salary = 200000;

        SyntaxEmployee person2= new SyntaxEmployee();
        person2.empID = "222";
        person2.salary = 220000;

        System.out.println(person1.empID
                + " " + person1.salary
        + " " + SyntaxEmployee.ceo);


        System.out.println(person2.empID
                + " " + person2.salary
                + " " + SyntaxEmployee.ceo);
    }

}
