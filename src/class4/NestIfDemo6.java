package class4;

public class NestIfDemo6 {
    public static void main(String[] args) {
        int money = 100;
        String day = "Sunday";
        boolean mood = true;

        if (money > 700) {

            if (mood) {
                System.out.println("Lets go shoping");
            }
        } else {
            System.out.println("Lets save some money first");
        }

    }
}