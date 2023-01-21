package ProjectHomeWork;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
        )Using Scanner create an array of integer values.
         After the array is created, calculate the sum of all stored elements in that array.
         */
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[5];
        numbers[0] = scan.nextInt();
        numbers[1] = scan.nextInt();
        numbers[2] = scan.nextInt();
        numbers[3] = scan.nextInt();
        numbers[4] = scan.nextInt();
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum = sum + numbers[i];

        }
        System.out.println(sum);
    }
}
