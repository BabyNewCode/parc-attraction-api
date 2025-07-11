package com.parc.controller;

import com.parc.model.Restaurant;
import com.parc.repository.RestaurantRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/restaurants")
public class RestaurantController {

    private final RestaurantRepository repo;

    public RestaurantController(RestaurantRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Restaurant> getAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Restaurant getById(@PathVariable Long id) {
        return repo.findById(id).orElseThrow();
    }

    @PostMapping
    public Restaurant create(@RequestBody Restaurant r) {
        return repo.save(r);
    }

    @PutMapping("/{id}")
    public Restaurant update(@PathVariable Long id, @RequestBody Restaurant updated) {
        Restaurant r = repo.findById(id).orElseThrow();
        r.setNom(updated.getNom());
        return repo.save(r);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repo.deleteById(id);
    }
}
