package class15;

public class MethodPracticeTester {
    public static void main(String[] args) {


        MethodPractice method = new MethodPractice();
        boolean b = method.evenOrNot(7);
        System.out.println(b);
        method.isEven(9);
        boolean b1 = method.isEven(20);
        System.out.println(b1);

        b1 = method.isEven(100);
        System.out.println(b1);
        b1 = method.isEven(12);
        System.out.println(b1);
        b1 = method.isEven(20);
        System.out.println(b1);
    }
}