package class10;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerAndArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 5 number");
        int[] arr = new int[5];
//        arr[0] = scan.nextInt();
//        arr[1]= scan.nextInt();
//        arr[2] = scan.nextInt();
//        arr[3] = scan.nextInt();
//        arr[4] = scan.nextInt();
//        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i ++){
            arr[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));

    }
}
