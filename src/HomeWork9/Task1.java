package HomeWork9;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Create an array of chars and store grades into it: A,B,C,D,E,F.
        // Then print a grade B (use 2 different ways of creating an array).
        char[] arr = {'A', 'B', 'C', 'D', 'E', 'F'};
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 'B'){
                System.out.println(arr[i]);

            }
        }

    }
}
