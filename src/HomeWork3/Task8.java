package HomeWork3;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        /*
        Allow user to enter grade and then provide explanation: A-Excellent, B-Good, C-Average, D-Bad,
         any other grade --> Not Acceptable.
         At the end your program should print which grade was entered by a user with explanation.
         */
    Scanner grade = new Scanner(System.in);
        System.out.println("Please enter your grade");
        char yourGrade = grade.next().charAt(0);
        switch (yourGrade){
            case 'A':
                System.out.println("Exelent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Bad");
                break;
            default:
                System.out.println("Not Acceptable");
        }

    }
}
