package com.parc.controller;

import com.parc.dto.PersonnelDto;
import com.parc.model.Personnel;
import com.parc.service.PersonnelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/personnel")
public class PersonnelController {

    @Autowired
    private PersonnelService personnelService;

    @GetMapping
    public ResponseEntity<List<Personnel>> getAllPersonnel() {
        List<Personnel> personnelList = personnelService.findAll();
        return new ResponseEntity<>(personnelList, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Personnel> createPersonnel(@Valid @RequestBody PersonnelDto personnelDto) {
        Personnel createdPersonnel = personnelService.createPersonnel(personnelDto);
        return new ResponseEntity<>(createdPersonnel, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Personnel> getPersonnelById(@PathVariable Long id) {
        Personnel personnel = personnelService.findById(id);
        return new ResponseEntity<>(personnel, HttpStatus.OK);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Personnel> updatePersonnel(@PathVariable Long id, @Valid @RequestBody PersonnelDto personnelDto) {
        Personnel updatedPersonnel = personnelService.updatePersonnel(id, personnelDto);
        return new ResponseEntity<>(updatedPersonnel, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePersonnel(@PathVariable Long id) {
        personnelService.deletePersonnel(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}