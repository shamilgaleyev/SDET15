package class23;

public class Student {
    public void hardStudy(){
        System.out.println("Students have to study hard");
    }
}
class SyntaxStudent extends Student{
    @Override
    public void hardStudy() {
        System.out.println("Syntax Students have to study hard");
    }

    public void studyWeekEnd(){
        System.out.println("Syntax Students have to study weekend");
    }
}
class CollegeStudent extends Student{
    @Override
    public void hardStudy() {
        System.out.println("College Students have to study hard");
    }
    public void howLongStudy(){
        System.out.println("College Students study 2 years");
    }
}
class SchoolStudent extends Student{
    @Override
    public void hardStudy() {
        System.out.println(" School Students have to study hard");
    }
    public void easyStudy(){
        System.out.println("Easy study is for School Students");
    }
}