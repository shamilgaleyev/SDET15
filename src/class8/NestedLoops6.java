package class8;

public class NestedLoops6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("______________");

        for (int i = 1; i <= 3; i ++){
            for (int j = 1; j <= 5; j ++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

}
