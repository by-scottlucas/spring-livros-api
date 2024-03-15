package br.com.spring.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.spring.mvc.model.Livro;
import br.com.spring.mvc.repository.BookRepository;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public List<Livro> list() {
        return bookRepository.findAll();
    }
}
