package class5;

import java.util.Scanner;

public class SwitchCaseDemo5 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your gender");
        char gender = scanner.next().charAt(0);

     switch (gender){
         case 'F':
             System.out.println("Female");
             break;
         case 'M':
             System.out.println("Male");
             break;
         default:
             System.out.println("Not selected");
     }

    }
}
