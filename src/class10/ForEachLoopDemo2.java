package class10;

public class ForEachLoopDemo2 {
    public static void main(String[] args) {
        int[] arr = {10, 13, 20, 25, 45, 50};
        for (int i = 0; i < 6; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
            }
        }
        System.out.println("________________");
        for (int i = 0; i < 6; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = 0;
                continue;
            }
            System.out.println(arr[i]);
        }
    }
}