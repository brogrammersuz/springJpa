package uz.brogrammers.dto;

import java.util.HashSet;
import java.util.Set;

public class BookResponse {
    private Long id;
    private String title;
    private String isbn;
    private String publisher;
    private Set<String> authors = new HashSet<>();

    public BookResponse(Long id, String title, String isbn, String publisher, Set<String> authors) {
        this.id = id;
        this.title = title;
        this.isbn = isbn;
        this.publisher = publisher;
        this.authors = authors;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Set<String> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<String> authors) {
        this.authors = authors;
    }
}
