package Day4_Aggregation;

public class Book {

    String title;
    int year;

    Book (String title, int year) {
        this.title = title;
        this.year = year;
    }

    void displayInformation() {
        System.out.println(this.title + " (" + this.year + ")");
    }

}
