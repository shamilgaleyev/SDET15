package HomeWork17;

public class Book {

    /*
     Write Book class that will have instance variables and 2 Constructors.
      While creating an object make sure:
      Instance variables are being initialized
      Both Constructors are being executed
     */
    String name;
    String author;
    String genre;
    int pages;

    Book(String nameOfBook, String authorOfBook, String genreOfBook, int page){
        name = nameOfBook;
        author = authorOfBook;
        genre = genreOfBook;
        pages = page;
    }
    Book(int page, String nameOfBook, String authorOfBook, String genreOfBook){
        name = nameOfBook;
        author = authorOfBook;
        genre = genreOfBook;
        pages = page;
    }
    void printInfo(){
        System.out.println("Name of book: " + name + ";");
        System.out.println("Author of book: " + author + ";");
        System.out.println("Genre of book: " + genre + ";");
        System.out.println("How many pages: " + pages + ".");
    }

    public static void main(String[] args) {
        Book bookForAdult = new Book("Summer","John Smith","action",140);
        Book bookForKids = new Book(50,"Fox","Gans Anderson","fairy tail");
        bookForAdult.printInfo();
        System.out.println("***********************************");
        bookForKids.printInfo();
    }

}
