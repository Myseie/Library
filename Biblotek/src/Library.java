import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Member> members;

    public Library(){
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }
    public void addMember(Member member){
        members.add(member);
    }

    public void checkOutBook(String title) {
        for (Book book : books){
            if(book.getTitle().equalsIgnoreCase(title) && !book.isCheckedOut()){
                book.checkOut();
                System.out.println("You have checked out: " + book);
                return;
            }
        }
        System.out.println("Book is not available or doesn't exist.");
    }

    public void returnBook(String title){
        for(Book book : books){
            if(book.getTitle().equalsIgnoreCase(title) && book.isCheckedOut()){
                book.returnBook();
                System.out.println("You have returned: " + book);
                return;
            }
        }
        System.out.println("This book was not checked out.");
    }
    public void listBooks() {
        for(Book book : books){
            System.out.println(book);
        }
    }
}
