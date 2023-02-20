package Project2HomeWork;

abstract public class Marks {
    /*
    We have to calculate the average of marks
obtained in three subjects by student A and by
student B. Create class 'Marks' with an abstract
method 'getPercentage' that will be returning
the average percentage of marks. Provide
implementation of abstract method in classes
'A' and 'B'. The constructor of student A takes the
marks in three subjects as its parameters and
the marks in four subjects as its parameters for
student B. Test your code
     */
    int m1,m2,m3,m4;
    double averege;
    Marks(int m1,int m2,int m3){
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
    Marks(int m1,int m2,int m3,int m4){
        this(m1,m2,m3);
        this.m4 = m4;
    }
    abstract double getPercentage();


}
class A extends Marks{
    public A(int m1, int m2, int m3) {
        super(m1, m2, m3);
    }

    @Override
    double getPercentage() {
        averege = (m1+m2+m3)/3;
        return averege;
    }
}class B extends Marks{
    public B(int m1, int m2, int m3, int m4) {
        super(m1, m2, m3, m4);
    }

    @Override
    double getPercentage() {
        averege = (m1+m2+m3+m4)/4;
        return averege;
    }
}
class TesterMarks{
    public static void main(String[] args) {
        Marks s1 = new A(98,87,99);
        Marks s2 = new B(91,92,90,92);
        System.out.println("Student A - the average percentage of marks: "+s1.getPercentage());
        System.out.println("Student B - the average percentage of marks: "+s2.getPercentage());
    }
}