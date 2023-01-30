package HomeWork15;

public class Task2 {
    //Create a method that will take a number and prints whether the number is even or odd.
    String evenOrOdd(int n){
        if (n % 2 == 0){
            return "even";
        } else {
            return "odd";
        }
    }

    public static void main(String[] args) {
        Task2 evenOdd = new Task2();
        System.out.println(evenOdd.evenOrOdd(33));
    }
}
