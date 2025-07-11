package com.parc.controller;

import com.parc.model.Ticket;
import com.parc.service.TicketService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tickets")
public class TicketController {

    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @PostMapping
    public Ticket acheter(@RequestParam Long userId, @RequestParam double prix) {
        return ticketService.acheter(userId, prix);
    }
}
