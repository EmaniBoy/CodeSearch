package com.example.demo.repositories;

import com.example.demo.entities.CodeSnippet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CodeSnippetRepository extends JpaRepository<CodeSnippet, Long> {
    // No extra methods needed for basic CRUD
}
