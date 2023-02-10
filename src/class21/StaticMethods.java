package class21;

public class StaticMethods {
    static void sum(int a, int b){
        System.out.println(a + b);
    }
    static void sum(int a, int b, int c){
        System.out.println(a + b +c);
    }
    static void sum(int a, int b, int c, int d){
        System.out.println(a + b + c + d);
    }

    public static void main(String[] args) {
        StaticMethods.sum(1, 2);
        StaticMethods.sum(1, 2, 3);
        StaticMethods.sum(1, 2, 3, 4);

        sum(1, 2);
        sum(1, 2, 3);
        sum(1, 2, 3, 4);

    }
}
