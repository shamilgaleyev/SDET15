package class24;

public class FinalDemo {
    public static void main(String[] args) {
        final int  num;  // constant variable
        num = 20;
       // num = 30;  not posible because the variable is declared final
    }
    final void noOneShouldOverrideIt(){
        System.out.println("This method should never be overridden");
    }
}
