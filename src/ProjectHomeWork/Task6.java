package ProjectHomeWork;

public class Task6 {
    public static void main(String[] args) {
        /*
        Write a program to swap 2 numbers without a temporary variable?
         */
        int k = 20;
        int l = 30;
        k = k + l;
        l = k - l;
        k = k - l;

        System.out.println("k = " + k + "; l = " + l );

    }
}
