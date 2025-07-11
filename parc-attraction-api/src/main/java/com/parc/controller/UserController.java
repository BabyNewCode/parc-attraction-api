package com.parc.controller;

import com.parc.model.*;
import com.parc.repository.*;
import com.parc.service.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserRepository userRepo;
    private final TicketRepository ticketRepo;
    private final UserService userService;

    public UserController(UserRepository userRepo, TicketRepository ticketRepo, UserService userService) {
        this.userRepo = userRepo;
        this.ticketRepo = ticketRepo;
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAll() {
        return userRepo.findAll();
    }

    @PostMapping
    public User create(@RequestBody User u) {
        return userRepo.save(u);
    }

    @PatchMapping("/{id}/ban")
    public void ban(@PathVariable Long id) {
        userService.bannir(id);
    }

    @GetMapping("/{id}/tickets")
    public List<Ticket> getTickets(@PathVariable Long id) {
        User u = userRepo.findById(id).orElseThrow();
        return u.getBillets();
    }
}
