package review6;

public class StringMethod {

    public static void main(String[] args) {


        String str = "Hello";
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.charAt(1));

        String newString = str.concat(" friends");
        System.out.println(newString);


        System.out.println(str);

        boolean empty = str.isEmpty();
        System.out.println(empty);

        String str1 = "  Review B15  ";
        System.out.println(str1.trim());



    }
}