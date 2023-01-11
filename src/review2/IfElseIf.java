package review2;

public class IfElseIf {
    public static void main(String[] args) {
        int task = 35;
        if (task > 25) {
            System.out.println("great job");
        } else if (task > 20) {
            System.out.println("good job");
        } else if (task > 10) {
            System.out.println("ok job");
        } else if (task > 5) {
            System.out.println("not good job");
        }
        System.out.println("_______________________");

        String browser = "opera";
        if (browser.equals("chrome")){
            System.out.println("Test case executed on chrome browser");
        } else if (browser.equals("safary")) {
            System.out.println("Test case executed on safary browser");
        } else if (browser.equals("firefox")) {
            System.out.println("Test case executed on firefox browser");
        } else {
            System.out.println("Browser is not supported ");
        }



    }
}
