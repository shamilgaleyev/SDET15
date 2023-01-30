package review5;

public class TwoDArrayReview {
    public static void main(String[] args) {
        int[][] array = {{1,2,3},
                       {11,12,13},
                       {20,21,22},
                       {100,101}};
//        System.out.println(array.length);
//        System.out.println(array[3].length);
//        System.out.println(array[2][1]);
//        for (int[] num1: array){
//            for ( int num2: num1) {
//                if (num2 % 2 == 0) {
//                    System.out.print(num2 + " ");
//                }
//            }
//            System.out.println();
//        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                if (i % 2 != 0) {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();

        }



    }
}
