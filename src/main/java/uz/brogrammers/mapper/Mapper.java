package uz.brogrammers.mapper;

import uz.brogrammers.dto.BookResponse;
import uz.brogrammers.entity.Book;

import java.util.Set;
import java.util.stream.Collectors;

public class Mapper {

    public static BookResponse mapBookResponse(Book book) {

        Set<String> authors = book.getAuthors().stream()
                .map(a -> a.getFirstName() + " " + a.getLastName())
                .collect(Collectors.toSet());

        return new BookResponse(book.getId(), book.getTitle(), book.getIsbn(), book.getPublisher().getName(), authors);
    }

}
