package HomeWork16;

public class Task2 {

    /*
    Create a method that will take a String as a parameter and returns reversed String.
     Method should be available to all classes within your project and accessible by class name.
     */

    public String reverse(String str) {
        StringBuilder s = new StringBuilder(str);
        s.reverse();
        String reverse = s.toString();
        return reverse;
    }

        public static String reverseStr1(String input){
            return new StringBuilder(input).reverse().toString();
        }


    public static void main(String[] args) {
        Task2 reverseStr = new Task2();
        System.out.println(reverseStr.reverse("Java"));

        System.out.println(Task2.reverseStr1("Sunday"));

    }
}
