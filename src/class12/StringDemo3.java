package class12;

public class StringDemo3 {
    public static void main(String[] args) {
        String firstName = "Akhter";
        String lastName = "Lava";
        String fullName = firstName + " " + lastName; //most used
        System.out.println(fullName);
        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.concat(" " +lastName));

    }
}
