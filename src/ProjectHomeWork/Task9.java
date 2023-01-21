package ProjectHomeWork;

public class Task9 {
    public static void main(String[] args) {
        /*
        Maximum and minimum number in the array?
         */
        int max = 0;
        int min = 0;
        int [] arr = {12, 7, 5, 3, 14, 40};
        for (int i = 0; i < arr.length; i++) {
            if (min + arr[i] > arr[++i]){
                    min = arr[i];
            }
            if (max < arr[i]){
                max = arr[i];
            }
            }
        System.out.println("max number = " + max);
        System.out.println("min number = " + min);
        }
    }

