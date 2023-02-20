package class28;

import java.util.LinkedList;

public class LinkedListDemo2 {
    public static void main(String[] args) {
        LinkedList<String> subject = new LinkedList<>();
        subject.add("SDLC");
        subject.add("Manual testing");
        subject.add("Jira");
        subject.add("Git");
        subject.add("Java");

        LinkedList<String> futureSubject = new LinkedList<>();
        futureSubject.add("Selenium");
        futureSubject.add("Testing NG");
        futureSubject.add("Cucumber");
        futureSubject.add("SQL");
        futureSubject.add("APIs");
        futureSubject.add("Jenkins");
        System.out.println();

        LinkedList<String> allSubjects = new LinkedList<>();
        allSubjects.addAll(subject);
        allSubjects.addAll(futureSubject);
        System.out.print(allSubjects + " ");

        LinkedList<String> subjectILike = new LinkedList<>();
        subjectILike.add("Java");
        subjectILike.add("SDLC");
        subjectILike.add("SQL");
        System.out.println(subjectILike);
        System.out.println();
        allSubjects.removeAll(subjectILike);
        System.out.println(allSubjects);
    }
}
