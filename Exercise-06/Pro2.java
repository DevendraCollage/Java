/*
 * Declare a class called book having author_name as private data member. Extend book class 
 * to have two sub classes called book_publication & paper_publication. Each of these classes 
 * have private member called title. Write a complete program to show usage of dynamic 
 * method dispatch (dynamic polymorphism) to display book or paper publications of given 
 * author.Use command line arguments for inputting data.
 */
class Book {
    private String author_name;

    public Book(String author_name) {
        this.author_name = author_name;
    }

    public void display() {
        System.out.println("Author : " + author_name);
    }
}

class Book_publication extends Book {
    private String title;

    public Book_publication(String authorname, String title) {
        super(authorname);
        this.title = title;
    }

    public void display() {
        System.out.println("Title : " + title);
    }
}

class Paper_publication extends Book {
    private String title;

    public Paper_publication(String authorname) {
        super(authorname);
    }

    public void display() {
        System.out.println("Title : " + title);
    }
}

public class Pro2 {
    public static void main(String[] args) {
        // Extract Data From CLI
        String author_name = args[0];
        String Book_publication = args[1];
        String Book_Title = args[2];

        // Create Class Object Using Dynamic Method Dispatch
        Book bpublication = new Book_publication(author_name, Book_Title);
        Book ppublication = new Paper_publication(Book_publication);

        // Print the method of the class
        bpublication.display();
        ppublication.display();
    }
}
