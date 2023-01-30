package class15;

public class Task1 {
    String createEmail(String firstName, String lastName, String emailSort){
        return firstName+lastName+"@"+emailSort + ".com";
    }
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        System.out.println(task1.createEmail("john","smith","gmail"));
    }
}
