package com.parc.controller;

import com.parc.model.Personnel;
import com.parc.model.Restaurant;
import com.parc.repository.PersonnelRepository;
import com.parc.repository.RestaurantRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/personnel")
public class PersonnelController {

    private final PersonnelRepository personnelRepo;
    private final RestaurantRepository restaurantRepo;

    public PersonnelController(PersonnelRepository personnelRepo, RestaurantRepository restaurantRepo) {
        this.personnelRepo = personnelRepo;
        this.restaurantRepo = restaurantRepo;
    }

    @GetMapping
    public List<Personnel> getAll() {
        return personnelRepo.findAll();
    }

    @GetMapping("/{id}")
    public Personnel getById(@PathVariable Long id) {
        return personnelRepo.findById(id).orElseThrow();
    }

    @PostMapping
    public Personnel create(@RequestBody Personnel p, @RequestParam Long restaurantId) {
        Restaurant r = restaurantRepo.findById(restaurantId).orElseThrow();
        p.setRestaurant(r);
        return personnelRepo.save(p);
    }

    @PutMapping("/{id}")
    public Personnel update(@PathVariable Long id, @RequestBody Personnel updated) {
        Personnel p = personnelRepo.findById(id).orElseThrow();
        p.setNom(updated.getNom());
        p.setRole(updated.getRole());
        return personnelRepo.save(p);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        personnelRepo.deleteById(id);
    }
}
