package class16;

public class Person {
    private double bankBalance = 150000;
    String address = "Street 123";
    String name = "Jon Snow";
    private void printPhonePassword(){
        System.out.println("pass123");
    }

    void printSSN(){
        System.out.println("12312323");
    }

    public void printTikTockAccount(){
        System.out.println("user123");
    }


    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.bankBalance);
        System.out.println(person.address);
        System.out.println(person.name);


    }

}
