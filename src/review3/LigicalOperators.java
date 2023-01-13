package review3;

public class LigicalOperators {
    public static void main(String[] args) {
        boolean loginButtonDisplayed = true;
        boolean loginBottonClickable = false;
        if (loginButtonDisplayed && loginBottonClickable){
            System.out.println("Test case is passed");
        } else {
            System.out.println("Test case failed");
        }
        System.out.println("_____________________________________");
        boolean dashboard = false;
        String message = "Welcome admin";

        if (dashboard || message.equals("Welcome admin")){
            System.out.println("User is successfully loged in");
        } else {
            System.out.println("User is not logged in");
        }
        System.out.println("_____________________________________");

        boolean b = true;
        System.out.println(!b);

        boolean agreeCheckboxSelected = false;
        if (!agreeCheckboxSelected) {
            System.out.println("I am clicking on checkbox");
        }
            System.out.println("I am clicking on submit button");


    }
}
