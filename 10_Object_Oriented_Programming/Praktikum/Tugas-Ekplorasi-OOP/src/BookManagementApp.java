import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class BookManagementApp {
    private static final Scanner scanner = new Scanner(System.in);
    private static final BookManager manager = new BookManager();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Welcome to book management app\nPlease choose your menu:");
            System.out.println("1. Create a new book\n2. Get all books\n3. Get book by ID\n4. Update book\n5. Delete book\n6. Exit");
            System.out.print("Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the leftover newline

            switch (choice) {
                case 1:
                    createBookFlow();
                    break;
                case 2:
                    manager.getAllBooks();
                    break;
                case 3:
                    getBookByIdFlow();
                    break;
                case 4:
                    updateBookByIdFlow();
                    break;
                case 5:
                    deleteBookByIdFlow();
                    break;
                case 6:
                    System.out.println("Bye...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void createBookFlow() {
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author: ");
        String author = scanner.nextLine();
        System.out.print("Enter category: ");
        String category = scanner.nextLine();
        manager.createBook(title, author, category);
    }

    private static void getBookByIdFlow() {
        System.out.print("Enter book ID: ");
        String id = scanner.nextLine();
        manager.getBookById(id);
    }

    private static void updateBookByIdFlow() {
        System.out.print("Enter book ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter new title: ");
        String newTitle = scanner.nextLine();
        System.out.print("Enter new author: ");
        String newAuthor = scanner.nextLine();
        System.out.print("Enter new category: ");
        String newCategory = scanner.nextLine();
        manager.updateBookById(id, newTitle, newAuthor, newCategory);
    }

    private static void deleteBookByIdFlow() {
        System.out.print("Enter book ID: ");
        String id = scanner.nextLine();
        manager.deleteBookById(id);
    }
}

