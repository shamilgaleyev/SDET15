package ProjectHomeWork;

public class Task3 {
    public static void main(String[] args) {
        /*
        Create a 2D array of integer values. Print the sum of all numbers
         */
        int[][] numbers = {{3,3,3,3},
                           {2,2,2,2},
                           {1,1,1,1}};
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                sum = sum+ numbers[i][j];
            }

        }
        System.out.println(sum);
    }
}
