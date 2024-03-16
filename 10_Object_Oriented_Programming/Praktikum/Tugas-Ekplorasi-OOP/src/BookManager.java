import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

class BookManager {
    private final List<Book> books = new ArrayList<>();

    public void createBook(String title, String author, String category) {
        books.add(new Book(title, author, category));
        System.out.println("Book created successfully!");
    }

    public void getAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            books.forEach(book -> System.out.println(book + "\n==="));
        }
    }

    public void getBookById(String id) {
        books.stream()
                .filter(book -> book.getId().equals(id))
                .findFirst()
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println("Book not found.")
                );
    }

    public void updateBookById(String id, String newTitle, String newAuthor, String newCategory) {
        books.stream()
                .filter(book -> book.getId().equals(id))
                .findFirst()
                .ifPresentOrElse(book -> {
                    book.setTitle(newTitle);
                    book.setAuthor(newAuthor);
                    book.setCategory(newCategory);
                    System.out.println("Book updated!\n" + book);
                }, () -> System.out.println("Book not found."));
    }

    public void deleteBookById(String id) {
        if (books.removeIf(book -> book.getId().equals(id))) {
            System.out.println("Book deleted.");
        } else {
            System.out.println("Book not found.");
        }
    }
}

