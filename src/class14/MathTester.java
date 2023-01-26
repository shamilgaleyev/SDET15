package class14;

import java.util.Scanner;

public class MathTester {
    public static void main(String[] args) {
        Math math = new Math();
        math.add(5,7);

        math.multiplay(2,3,1);

//        Scanner s = new Scanner(System.in);
//       int num = s.nextInt();

       int result = math.sub(10,5);
        System.out.println(result);
    }
}
