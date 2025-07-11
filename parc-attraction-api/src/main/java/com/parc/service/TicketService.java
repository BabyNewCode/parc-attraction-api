package com.parc.service;

import com.parc.dto.TicketDto;
import com.parc.model.Ticket;
import com.parc.model.User;
import com.parc.repository.TicketRepository;
import com.parc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;

@Service
public class TicketService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TicketRepository ticketRepository;

    public Ticket buyTicket(Long userId, @Valid TicketDto dto) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found"));

        if (user.isBanni()) {
            throw new ResponseStatusException(HttpStatus.FORBIDDEN, "User is banned");
        }

        double price = dto.getPrix();
        if (user.getAge() < 18) {
            price *= 0.7; // Apply 30% discount
        }

        Ticket ticket = new Ticket();
        ticket.setPrix(price);
        ticket.setAcheteur(user);
        return ticketRepository.save(ticket);
    }
}