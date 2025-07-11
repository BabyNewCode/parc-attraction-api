package com.parc.service;

import com.parc.model.Attraction;
import com.parc.repository.AttractionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttractionService {

    @Autowired
    private AttractionRepository attractionRepository;

    public void closeAttraction(Long id) {
        Attraction attraction = attractionRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Attraction not found"));
        attraction.setOuverte(false);
        attractionRepository.save(attraction);
    }

    public void openAttraction(Long id) {
        Attraction attraction = attractionRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Attraction not found"));
        attraction.setOuverte(true);
        attractionRepository.save(attraction);
    }
}