package library;

public class MAINCLASS {
	public static void main(String[] args) {
        Library library = new Library();
        Function book = new Function();

        books book1 = new books(1, "The Great Gatsby", "F. Scott Fitzgerald");
        books book2 = new books(2, "1984", "George Orwell");

        book.addBook(book1);
        book.addBook(book2);

        library.addBook(book1);
        library.addBook(book2);

        System.out.println("Library: " + library);

        try {
			for (books books : Function.getAllBooks()) {
			    System.out.println("Book from DB: " + books);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
