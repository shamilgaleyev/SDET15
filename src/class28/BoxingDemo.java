package class28;

public class BoxingDemo {
    public static void main(String[] args) {
        Integer integer = new Integer(10);
        int number = integer;//auto unboxing
        int number2 = integer.intValue();// manual unboxing

        double d = 12.3;
        Double wrapperD = new Double(d);//boxing
        Double wrapperP = d;// auto boxing
    }
}
