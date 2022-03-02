package com.fabianosilva.bookstoremanager.repository;

import com.fabianosilva.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
