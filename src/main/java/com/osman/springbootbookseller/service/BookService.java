package com.osman.springbootbookseller.service;

import com.osman.springbootbookseller.model.Book;
import com.osman.springbootbookseller.repository.IBookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@Service
public class BookService implements IBookService{

    private final IBookRepository bookRepository;

    @Override
    public Book saveBook(Book book)
    {
        book.setCreatedAt(LocalDateTime.now());
        return bookRepository.save(book);
    }

    @Override
    public void deleteBook(Long id)
    {
        bookRepository.deleteById(id);
    }

    @Override
    public List<Book> findAllBooks()
    {
        return bookRepository.findAll();
    }
}
