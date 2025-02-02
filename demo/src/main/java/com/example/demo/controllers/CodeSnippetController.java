package com.example.demo.controllers;

import com.example.demo.entities.CodeSnippet;
import com.example.demo.repositories.CodeSnippetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/snippets")
public class CodeSnippetController {

    @Autowired
    private CodeSnippetRepository snippetRepo;

    @GetMapping
    public List<CodeSnippet> getAllSnippets() {
        return snippetRepo.findAll();
    }

    @GetMapping("/{id}")
    public CodeSnippet getSnippetById(@PathVariable Long id) {
        return snippetRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Snippet not found"));
    }

    @PostMapping
    public CodeSnippet createSnippet(@RequestBody CodeSnippet snippet) {
        return snippetRepo.save(snippet);
    }
}
