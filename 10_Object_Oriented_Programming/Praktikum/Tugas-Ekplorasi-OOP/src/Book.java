import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

class Book {
    private String id;
    private String title;
    private String author;
    private String category;

    public Book(String title, String author, String category) {
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.author = author;
        this.category = category;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nTitle: " + title + "\nAuthor: " + author + "\nCategory: " + category;
    }
}

