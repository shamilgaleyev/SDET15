package HomeWork19;

public class Test {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.name = "Smith";
        t.subject ="Math";
        t.hours = 35;
        t.daylySchedule();
        t.weekSchedule();
        t.plusHours();
        t.education();

        MathTeacher mt = new MathTeacher();
        mt.name = "Smith";
        mt.subject ="Math";
        mt.hours = 35;
        mt.daylySchedule();
        mt.weekSchedule();
        mt.plusHours();
        mt.education();
        mt.important();

        ChemistryTeacher ct = new ChemistryTeacher();
        ct.name = "Smith";
        ct.subject ="Math";
        ct.hours = 35;
        ct.daylySchedule();
        ct.weekSchedule();
        ct.plusHours();
        ct.education();
        ct.useful();

        PianoTeacher pt = new PianoTeacher();
        pt.name = "Smith";
        pt.subject ="Math";
        pt.hours = 35;
        pt.daylySchedule();
        pt.weekSchedule();
        pt.plusHours();
        pt.education();
        pt.justMusic();
    }
}
