package class19;

public class Teacher {

    String name;
    int teacherID;
    String subject;

    Teacher(String name, int teacherID){
        this.name = name;
        this.teacherID = teacherID;
    }

    Teacher(String name, int teacherID, String subject){
        this(name,teacherID);
        this.subject = subject;
    }
}
