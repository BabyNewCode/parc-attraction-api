package com.parc.controller;

import com.parc.model.Attraction;
import com.parc.service.AttractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/attractions")
public class AttractionController {

    @Autowired
    private AttractionService attractionService;

    @GetMapping
    public ResponseEntity<List<Attraction>> getAllAttractions() {
        List<Attraction> attractions = attractionService.findAll();
        return new ResponseEntity<>(attractions, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Attraction> createAttraction(@RequestBody Attraction attraction) {
        Attraction createdAttraction = attractionService.save(attraction);
        return new ResponseEntity<>(createdAttraction, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Attraction> getAttractionById(@PathVariable Long id) {
        Attraction attraction = attractionService.findById(id);
        return new ResponseEntity<>(attraction, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Attraction> updateAttraction(@PathVariable Long id, @RequestBody Attraction attraction) {
        Attraction updatedAttraction = attractionService.update(id, attraction);
        return new ResponseEntity<>(updatedAttraction, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAttraction(@PathVariable Long id) {
        attractionService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PatchMapping("/{id}/close")
    public ResponseEntity<Void> closeAttraction(@PathVariable Long id) {
        attractionService.closeAttraction(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PatchMapping("/{id}/open")
    public ResponseEntity<Void> openAttraction(@PathVariable Long id) {
        attractionService.openAttraction(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}