package class24;

public abstract class File {
    /*
    Create a class File that will have the following behaviors: open, edit, close.
     Edit and close are implemented method while open is an abstract.
      Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide
       specific implementation of open behaviour:
        Example: to open .java file we need notepad++ or sublime text,
         to open .doc file we need Microsoft word to be installed etc
     */
    abstract void open();
    abstract  void edit();
    abstract void close();
}
class JavaFile extends File{
    @Override
    void open() {
        System.out.println("Java file open");
    }

    @Override
    void edit() {
        System.out.println("JAva file edit");
    }

    @Override
    void close() {
        System.out.println("Java file close");
    }
}
class WordFile extends File{
    @Override
    void open() {
        System.out.println("Word file open");
    }

    @Override
    void edit() {
        System.out.println("Word file edit");
    }

    @Override
    void close() {
        System.out.println("Word file close");
    }
}
class PdfFile extends File{
    @Override
    void open() {
        System.out.println("PDF file open");
    }

    @Override
    void edit() {
        System.out.println("PDF file edit");
    }

    @Override
    void close() {
        System.out.println("PDF file close");
    }
}