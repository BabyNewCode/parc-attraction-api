package com.parc.controller;

import com.parc.dto.TicketDto;
import com.parc.service.TicketService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tickets")
public class TicketController {

    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @PostMapping
    public ResponseEntity<?> buyTicket(@RequestParam Long userId, @RequestBody TicketDto ticketDto) {
        return ResponseEntity.ok(ticketService.buyTicket(userId, ticketDto));
    }
}