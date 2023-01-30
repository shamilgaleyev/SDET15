package review5;

import java.util.Scanner;

public class ArrayWithScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many names you want to store");
        int size = scan.nextInt();

        String[] name = new String[size];

        for (int i = 0; i < name.length; i++) {
            System.out.println("Enter the name");
            name[i]=scan.next();
        }
        for (String name1: name){
            System.out.print(name1 + " ");
        }
    }
}
