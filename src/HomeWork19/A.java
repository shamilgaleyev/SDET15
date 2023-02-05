package HomeWork19;

public class A {
    //Write program for multilevel inheritance where class
    // C inherits from class B and Class B inherits from Class A.
//Write program to inherit class A
// that has method printF which is static and call or reuse that method into class B
    void aboutA(){
        System.out.println("Class A");
    }
    static void printF(){
        System.out.println("F");
    }
}
class B extends A{
    void aboutB(){
        System.out.println("Class B");

    }


}
class C extends B{
    void aboutC(){
        System.out.println("Class C");

    }
}
class D extends A{
    static void printF() {
        System.out.println("F");

    }}