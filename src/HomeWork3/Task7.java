package HomeWork3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner language = new Scanner(System.in);
        System.out.println("Please entry the country");
        String country = language.next();
        System.out.println("Please entry the capital");
        String capital = language.next();
        switch (country.toLowerCase()) {
            case "usa":
                System.out.println("English");
                break;
            case "italy":
                System.out.println("Italian");
                break;
            case "afganistan":
                System.out.println("Farsy");
                break;
            case "china":
                System.out.println("Chinese");
                break;
            case "france":
                System.out.println("Franch");
                break;
            default:
                System.out.println("Wrong country");
        }
    }
}
