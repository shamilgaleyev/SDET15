package review2;

public class NestedIf {
    public static void main(String[] args) {
        int dose = 2;
        boolean vaccine = false;
        if (vaccine) {
            System.out.println("How many dosses you have?");
            if (dose == 1) {
                System.out.println("You  need a second dose");
            } else {
                System.out.println("You are fully vaccinated");
            }

        } else {
            System.out.println("I do not have a vaccine");
        }
    }
}
