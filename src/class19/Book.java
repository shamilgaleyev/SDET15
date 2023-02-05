package class19;

 public class Book {
    /*
    Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed
     */

    String name;
    String author;
    String genre;
    int pages;

    Book(String name, String author, int pages, String genre){
       this.name = name;
        this.author = author;
        this.pages = pages;
        this.genre = genre;
    }
    Book(int pages, String name, String author, String genre){
        this( name,author, pages,genre);

    }
    void printInfo(){
        System.out.println("Name of book: " + name + ";");
        System.out.println("Author of book: " + author + ";");
        System.out.println("Genre of book: " + genre + ";");
        System.out.println("How many pages: " + pages + ".");
    }

    public static void main(String[] args) {
        Book bookForAdult = new Book("Summer","John Smith",140,"action");
        Book bookForKids = new Book(50,"Fox","Gans Anderson","fairy tail");
        bookForAdult.printInfo();
        System.out.println("***********************************");
        bookForKids.printInfo();

       
    }
}
