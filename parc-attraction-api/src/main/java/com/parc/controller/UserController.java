package com.parc.controller;

import com.parc.dto.UserDto;
import com.parc.model.User;
import com.parc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.findAll();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<User> createUser(@Valid @RequestBody UserDto userDto) {
        User createdUser = userService.createUser(userDto);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }

    @PatchMapping("/{id}/ban")
    public ResponseEntity<Void> banUser(@PathVariable Long id) {
        userService.banUser(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/{id}/tickets")
    public ResponseEntity<List<Ticket>> getUserTickets(@PathVariable Long id) {
        List<Ticket> tickets = userService.getUserTickets(id);
        return new ResponseEntity<>(tickets, HttpStatus.OK);
    }
}