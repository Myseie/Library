
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        //Lägg till nya böcker.
        library.addBook(new Book("Harry P", "J.K Rowling"));
        library.addBook(new Book("Sagan om ringen", "Tolkien"));

        //lägg till medlemmar.
        library.addMember(new Member("Jane Doe", 1));
        library.addMember(new Member("Miranda Westerholm", 2));

        library.listBooks();

        library.checkOutBook("Sagan om ringen");

        library.listBooks();

        library.returnBook("Sagan om ringen");

        library.listBooks();
    }
}

