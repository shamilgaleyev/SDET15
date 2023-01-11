package HomeWork2;

public class Task2_2 {
    public static void main(String[] args) {
    /*
    Create a Java program and store values of mortgage rate and mortgage price.
    First, program should check if rate is higher than 4.5 user will not buy a house,
     otherwise user will consider buying. Once user decides to buy a house,
     if price of the house is larger than 200000 than user will take a loan,
     otherwise user will pay cash.
     */
        double mortgageRate = 4.3;
        int housePrice = 190000;
        if (mortgageRate > 4.5) {
            System.out.println("John will not buy a house");
        } else {
            System.out.println("John will buy a house");
            if (housePrice > 200000) {
                System.out.println("John will take a loan");
            } else {
                System.out.println("John will pay cash");
            }
        }

    }
}
