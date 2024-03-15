package br.com.spring.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.spring.mvc.model.Livro;

@Repository
public interface BookRepository extends JpaRepository<Livro, Long> {
    
}