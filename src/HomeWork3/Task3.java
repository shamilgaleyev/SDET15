package HomeWork3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner score = new Scanner(System.in);
        System.out.println("Please enter your quiz score");
        double quiz = score.nextDouble();
        System.out.println("Please enter your mid term score");
        double midTerm = score.nextDouble();
        System.out.println("Please enter your final score");
        double finalScore = score.nextByte();
        double averegeScore = (quiz + midTerm + finalScore) / 3;

        if(averegeScore >= 90){
            System.out.println("grade A");
        } else if (averegeScore >= 70 && averegeScore < 90) {
            System.out.println("grade B");
        } else if (averegeScore >= 50 && averegeScore < 70) {
            System.out.println("grade C");
        } else if (averegeScore < 50) {
            System.out.println("grade F");

        }
    }

}
