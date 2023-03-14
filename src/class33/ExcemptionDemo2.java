package class33;

public class ExcemptionDemo2 {
    public static void main(String[] args) {
        System.out.println("Line 1");
        System.out.println("Line 2");
        System.out.println("Line 3");
        System.out.println("Line 4");
        System.out.println("Line 5");
        System.out.println("Line 6");
       try {
           System.out.println(10/0);
//           String name = null;
//           System.out.println(name.length());
       } catch(NullPointerException npe){
           System.out.println("We are trying to access a method on a null object");
       }catch (ArithmeticException ae){
           System.out.println("Someone trying to divide by 0");
       }
        System.out.println("Line 7");
        System.out.println("Line 8");
        System.out.println("Line 9");
    }
}
