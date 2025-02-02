package com.example.demo.repositories;

import com.example.demo.entities.Embedding;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmbeddingRepository extends JpaRepository<Embedding, Long> {
    // No extra methods needed for basic CRUD
}
