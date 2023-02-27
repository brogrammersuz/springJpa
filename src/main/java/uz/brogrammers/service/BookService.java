package uz.brogrammers.service;

import org.springframework.stereotype.Service;
import uz.brogrammers.dto.BookResponse;
import uz.brogrammers.mapper.Mapper;
import uz.brogrammers.repository.BookRepository;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<BookResponse> getBooks() {
        return bookRepository.findAll().stream()
                .map(Mapper::mapBookResponse)
                .toList();
    }
}
