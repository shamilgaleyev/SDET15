package class8;

import java.util.Scanner;

public class LoopWithString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Inter your name");
        while (s.next().equalsIgnoreCase("Sha")){
            System.out.println("Good student");
        }
    }
}
