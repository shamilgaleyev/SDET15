package class4;

import java.util.Scanner;

public class ScannerDemo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Are we free in the holidays");
        boolean istrue = input.nextBoolean();
        System.out.println("You are free in the holidays " + istrue);
    }
}
