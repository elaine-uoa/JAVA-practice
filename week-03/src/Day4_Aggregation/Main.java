package Day4_Aggregation;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("Harry Potter and the Socerer's Stone", 1994);
        Book book2 = new Book("Harry Potter and the Scott", 1995);
        Book book3 = new Book("Harry Potter and James", 1997);

        Book[] books = {book1, book2, book3};

        Library library = new Library("Auckland Central Library", 1986, books);

        library.displayInformation();


    }
}
