package ProjectHomeWork;

public class Task5 {
    public static void main(String[] args) {
        /*
        )Create a 2D array of integers. Develop a program which will calculate
        the sum of  even and odd numbers for that array.
         */
        int[][]numbers ={{12,13,14,15},
                         {2,3,4,5},
                         {7,8,9,10}};
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0){
                    sumEven = sumEven +numbers[i][j];
                }if (numbers[i][j] % 2 != 0){
                    sumOdd = sumOdd + numbers[i][j];
                }

            }

        }
        System.out.println("Sum of even numbers = " + sumEven);
        System.out.println("Sum of odd numbers = " + sumOdd);
    }
}
