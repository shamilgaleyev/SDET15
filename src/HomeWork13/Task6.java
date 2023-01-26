package HomeWork13;

public class Task6 {
    public static void main(String[] args) {
        /*
        How would you swap  2 strings without a temporary variable?

         */

        String a = "apple";
        String b = "banana";
        System.out.println(a.replace(a,b));
        System.out.println(b.replace(b,a));
    }
}
