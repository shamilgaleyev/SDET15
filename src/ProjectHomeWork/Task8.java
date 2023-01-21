package ProjectHomeWork;

public class Task8 {
    public static void main(String[] args) {
        /*
        Write a Java Program to print the first 10 numbers of Fibonacci series
         */
        int[] fib = new int[10];
        fib[0] = 0;
        fib[1] = 1;
        fib[2] = fib[0] + fib[1];
        fib[3] = fib[1] + fib[2];
        fib[4] = fib[2] + fib[3];
        fib[5] = fib[3] + fib[4];
        fib[6] = fib[4] + fib[5];
        fib[7] = fib[5] + fib[6];
        fib[8] = fib[6] + fib[7];
        fib[9] = fib[7] + fib[8];

        for (int x: fib){
            System.out.print(x + " ");


        }
    }
}
