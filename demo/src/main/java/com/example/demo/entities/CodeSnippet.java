package com.example.demo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "code_snippets")
public class CodeSnippet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String snippet;

    private String language;

    private String fileName;

    // Constructors
    public CodeSnippet() {}

    public CodeSnippet(String snippet, String language, String fileName) {
        this.snippet = snippet;
        this.language = language;
        this.fileName = fileName;
    }

    // Getters and setters (you can generate with your IDE)

    public Long getId() {
        return id;
    }

    public String getSnippet() {
        return snippet;
    }

    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
