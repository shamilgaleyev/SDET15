package HomeWork19;

public class JavaTeacher extends Teacher{
    void code(){
        System.out.println("Java teacher teaches cod");
    }

    public static void main(String[] args) {
        JavaTeacher java = new JavaTeacher();
        java.name = "Asel";
        java.hours = 40;
        java.daylySchedule();
        java.weekSchedule();
        java.plusHours();

    }
}
