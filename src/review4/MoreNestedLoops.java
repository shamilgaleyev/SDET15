package review4;

public class MoreNestedLoops {
    public static void main(String[] args) {
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 3; j++) {
                for (int k = 0; k <= 59; k++) {
                    System.out.println(i +""+j+":"+k);
                }
            }

        }
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 3; j++) {
                for (int k = 0; k <= 5; k++) {
                    for (int l = 0; l <= 9; l++) {
                        System.out.println(i +""+j+":"+k+ "" + l);
                    }
                }
            }

        }
    }
}
