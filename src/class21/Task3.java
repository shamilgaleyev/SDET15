package class21;

public class Task3 {
    private void sum(int a, int b){
        System.out.println(a + b);
    }
    private void sum(int a, int b, int c){
        System.out.println(a + b +c);
    }
    private void sum(int a, int b, int c, int d){
        System.out.println(a + b + c + d);
    }

    public static void main(String[] args) {
        Task3 sum = new Task3();
        sum.sum(1, 2);
        sum.sum(1, 2, 3);
        sum.sum(1, 2, 3, 4);



    }
}
