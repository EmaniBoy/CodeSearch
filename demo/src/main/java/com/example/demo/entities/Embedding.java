package com.example.demo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "embeddings")
public class Embedding {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // If you want a foreign key to the snippet table
    private Long snippetId;

    @Lob
    private byte[] embedding;

    public Embedding() {}

    public Embedding(Long snippetId, byte[] embedding) {
        this.snippetId = snippetId;
        this.embedding = embedding;
    }

    // Getters/setters
    public Long getId() {
        return id;
    }

    public Long getSnippetId() {
        return snippetId;
    }

    public void setSnippetId(Long snippetId) {
        this.snippetId = snippetId;
    }

    public byte[] getEmbedding() {
        return embedding;
    }

    public void setEmbedding(byte[] embedding) {
        this.embedding = embedding;
    }
}
