package ProjectHomeWork;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        /*
        Write a java program to check whether a given number is prime or not?
         */
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        if (num % 2 != 0 && num % 3 != 0 && num % 5 != 0 && num % 7 != 0 ){
            System.out.println(num + " is prime number");
        } else {
            System.out.println(num + " is not prime number");
        }

        int given = 15;
        boolean isPrime = true;
        if (given > 1){
            for (int i = 2; i < given; i++) {
                if (given % i == 0){
                    isPrime = false;
                     break;
                }

            }
        } else {
            isPrime = false;
        }
    }
}
