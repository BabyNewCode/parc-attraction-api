package com.parc.service;

import com.parc.model.Personnel;
import com.parc.repository.PersonnelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonnelService {

    @Autowired
    private PersonnelRepository personnelRepository;

    public List<Personnel> findAll() {
        return personnelRepository.findAll();
    }

    public Optional<Personnel> findById(Long id) {
        return personnelRepository.findById(id);
    }

    public Personnel save(Personnel personnel) {
        return personnelRepository.save(personnel);
    }

    public void deleteById(Long id) {
        personnelRepository.deleteById(id);
    }
}