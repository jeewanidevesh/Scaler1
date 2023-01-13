package main.java.com.scaler.parkinglot.controllers;

import main.java.com.scaler.parkinglot.dtos.GenerateTicketRequestDto;
import main.java.com.scaler.parkinglot.dtos.GenerateTicketResponseDto;
import main.java.com.scaler.parkinglot.services.TicketService;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public GenerateTicketResponseDto generateTicket(
            GenerateTicketRequestDto request
    ) {
        return null;
    }
}
