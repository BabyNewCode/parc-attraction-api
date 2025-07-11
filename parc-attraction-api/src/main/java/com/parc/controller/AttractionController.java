package com.parc.controller;

import com.parc.model.Attraction;
import com.parc.repository.AttractionRepository;
import com.parc.service.AttractionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/attractions")
public class AttractionController {

    private final AttractionRepository repo;
    private final AttractionService service;

    public AttractionController(AttractionRepository repo, AttractionService service) {
        this.repo = repo;
        this.service = service;
    }

    @GetMapping
    public List<Attraction> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public Attraction create(@RequestBody Attraction a) {
        return repo.save(a);
    }

    @PatchMapping("/{id}/close")
    public void fermer(@PathVariable Long id) {
        service.fermer(id);
    }

    @PatchMapping("/{id}/open")
    public void ouvrir(@PathVariable Long id) {
        service.ouvrir(id);
    }
}
