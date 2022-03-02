package com.fabianosilva.bookstoremanager.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = false)
    private String name;
    
    @Column(nullable = false)
    private int pages;
    
    @Column(nullable = false)
    private int chapters;

    @Column(nullable = false, unique = true)
    private String isbn;
    
    @Column(name= "publisher_name", nullable = false, unique = true)
    private String publisher_name;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JoinColumn(name="author_id")
    private Author author;
}
