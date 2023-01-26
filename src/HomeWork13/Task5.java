package HomeWork13;

public class Task5 {
    public static void main(String[] args) {
       /*
       How would you check if String is palindrome or not? aba=> true
      Abbc =>false
        */

        String str = "ABBA";
        StringBuilder s = new StringBuilder(str);
        StringBuilder str2 = s.reverse();
        System.out.println(str2);
        if (str.contentEquals(str2)){
            System.out.println("String is palindrome");
        }
    }
}
