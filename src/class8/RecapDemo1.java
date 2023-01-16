package class8;

public class RecapDemo1 {
    public static void main(String[] args) {
        int i = 10;
        while (i >= 2) {
            System.out.println(i);
            i -= 2;
        }
        int n = 10;
        do {
            System.out.println(n);
            n -= 2;
        }while (n >= 2);

        for (int k = 10; k >= 2; k -= 2){
            System.out.println(k);
        }
    }
}
