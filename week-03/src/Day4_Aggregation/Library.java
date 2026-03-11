package Day4_Aggregation;

public class Library {

    String name;
    int year;
    Book[] books;

    public Library(String name, int year,  Book[] books) {
        this.name = name;
        this.year = year;
        this.books = books;
    }

    void displayInformation() {
        System.out.println(this.name + " was built in " + this.year);
        System.out.println("Books available: ");
        for (Book book : books) {
            book.displayInformation();
        }
    }
}
