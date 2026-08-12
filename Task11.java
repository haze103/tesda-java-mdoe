public class Task11 {
    public static void main(String[] args) {
        int bookCnt = 1;
        Book[] books = new Book[] {
            new Book("Java Programming", "John Smith", 2021, 39.99),
            new Book("Python Basics", "Jane Doe", 2020, 29.99),
            new Book("C++ Essentials", "Michael Johnson", 2019, 49.99)
        };
        
        for (Book b: books) {
            System.out.println("Book " + bookCnt++ + ":");
            System.out.println(b);
        }
    }
}

class Book {
    private String title, author;
    private int yearPublished;
    private double price;

    public Book (String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Title: \"" + this.title + "\"\n" + 
            "Author: \"" + this.author + "\"\n" + 
            "Year Published: " + this.yearPublished + "\n" + 
            "Price: $" + this.price + "\n";
    }
}