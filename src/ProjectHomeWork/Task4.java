package ProjectHomeWork;

public class Task4 {
    public static void main(String[] args) {
        /*
        Create a 2D array or integer type where you will store odd and even numbers.
         Develop a program which will identify/print the even numbers only.
         */
        int[][]numbers ={{12,13,14,15},
                         {2,3,4,5},
                         {7,8,9,10}};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0){
                    System.out.print(numbers[i][j] + " ");
                }

            }
            System.out.println();
        }
    }
}
