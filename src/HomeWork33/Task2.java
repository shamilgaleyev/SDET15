package HomeWork33;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    /*
     Create a static method that will return a List of Exceptions.
Inside your method create objects of 4 exception classes using try
and catch blocks and store them inside your list.
Call your method inside main and print name and details of all Exception objects.
     */

    public static List<Exception> exceptionList() {

        List<Exception> list = new ArrayList<>();

        NullPointerException npe = new NullPointerException();
        try {
            throw npe;
        } catch (NullPointerException e) {
            list.add(npe);
        }

        ClassNotFoundException cnfe = new ClassNotFoundException();
        try {
            throw cnfe;
        } catch (ClassNotFoundException e) {
            list.add(cnfe);
        }

        ArithmeticException ae = new ArithmeticException();
        try {
            throw ae;
        } catch (ArithmeticException e) {
            list.add(ae);
        }

        RuntimeException re = new RuntimeException();
        try {
            throw re;
        } catch (RuntimeException e) {
            list.add(re);
        }

        return list;
    }

    public static void main(String[] args) {
        System.out.println(exceptionList());
    }

}
