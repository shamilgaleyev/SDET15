package HomeWork3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner height = new Scanner(System.in);
        System.out.println("Please enter your height");
        int heightInch = height.nextInt();
        if(heightInch < 60){
            System.out.println("Short");
        } else if(heightInch >= 60 && heightInch <= 72){
            System.out.println("Medium");
        } else {
            System.out.println("Tall");
        }




    }


}
