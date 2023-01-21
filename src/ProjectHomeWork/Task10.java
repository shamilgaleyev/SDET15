package ProjectHomeWork;

public class Task10 {
    public static void main(String[] args) {
        /*
        Write a java program to find the second largest number in the array
         */
        int max = 0;
        int max2 = 0;
        int [] arr = {12, 7, 5, 3, 14, 40};
        for (int i = 0; i < arr.length; i++) {

            if (max < arr[i]){
                max = arr[i];
            }

        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                continue;
            }

            if (max2 < arr[i]) {
                max2 = arr[i];
            }
        }
        System.out.println("The second largest number = " + max2);
    }
}
