package class3;

public class TypeCasting_5 {
    public static void main(String[] args) {
        long number = 125;
        byte shorternumber = (byte) number;
        float f = 10.5F;
        int num = (int) f;
        System.out.println(shorternumber);
        System.out.println(num);
        byte b = 10;
        int number2 = b;
        short c = (short) number2;
        System.out.println(c);

        float eggs = 12.5F;
        int wholePart = (int) eggs;
        System.out.println(wholePart);

        System.out.println((char)98);

    }
}