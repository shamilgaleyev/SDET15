package ProjectHomeWork;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
        Using Scanner create an array of countries. When an array is created, retrieve all values
        from it and while retrieving those values print capital for each country. (use 2 different loops).
         */
        Scanner s = new Scanner(System.in);
        String[] countrys = new String[3];
        countrys[0] = s.nextLine();
        countrys[1] = s.nextLine();
        countrys[2] = s.nextLine();
        String[] capitals = {"Rome", "Paris", "Madrid"};
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                if (i == j) {
//
//                    System.out.println(countrys[i] + " - capital is " + capitals[j]);
//                }
//
//            }
             for (String x: countrys){
                 System.out.print(x + " ");
            }
        System.out.println();
             for( String y: capitals){
            System.out.print(y + " ");
        }
    }
}
