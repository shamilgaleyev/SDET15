package HomeWork19;

public class Teacher {
    /*
    Write a Java program called Teacher.  Identify features and 4 behaviour of that Class.
    Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have it
    their own features and behaviour. Test all 4 classes
     */
    String name;
    String subject;
    int hours;
    void daylySchedule(){
        System.out.println("From 8 a.m. to 3 p.m.");
    }
    void weekSchedule(){
        System.out.println("From Monday to Friday");
    }
    void plusHours(){
        System.out.println("after 3 p.m.");
    }
    void education(){
        System.out.println("universaty education");
    }

}
