package HomeWork17;

public class StudentsTester {
    public static void main(String[] args) {
        Students st1 = new Students("Smith",85,93,100);
        st1.printInfo();

        Students st2 = new Students("Jackson",86,89,90);
        st2.printInfo();

        Students st3 = new Students("Gonzales", 90,90,89);
        st3.printInfo();

        Students st4= new Students("White", 90, 97, 92);
        st4.printInfo();

        Students st5 = new Students("North",99, 89, 89);
        st5.printInfo();
    }
}
