package review9;

public class Bank {
    public static void main(String[] args) {
        Customer c = new Customer();
        c.setName("Slava");
        c.getName();
        System.out.println("Name: " +c.getName());

        c.setSsn(123456789);
        c.getSsn();
        System.out.println(c.getSsn());

        PrivateClient p = new PrivateClient("Diana",43535367665l);
        System.out.println(p.getName());
        System.out.println(p.getSsn());
    }
}
