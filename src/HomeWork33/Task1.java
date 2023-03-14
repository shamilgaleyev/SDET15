package HomeWork33;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //How would handle InputMismatchException?
        // Input Mismatch Exception when user enters mismatch value then programmer expected.

        Scanner scan=new Scanner(System.in);
        try {
            System.out.println("Enter a number: ");
            int n = scan.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Not a whole number");
        }
    }
}
