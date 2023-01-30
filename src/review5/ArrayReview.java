package review5;

public class ArrayReview {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        System.out.println(arr[2]);
        System.out.println("Size of the array = " + arr.length);
        for(int y: arr){
            System.out.print(y + " ");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {

        }

        String[] colors = {"black", "white", "red", "purple", "blue"};
        for (String x: colors){
            System.out.print(x + " ");
        }
        System.out.println();

        for (int i = colors.length - 1; i >= 0 ; i--) {
            System.out.print(colors[i] + " ");

        }

    }
}
