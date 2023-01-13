package main.java.com.scaler.parkinglot.dtos;

import main.java.com.scaler.parkinglot.models.Ticket;

public class GenerateTicketResponseDto extends ResponseDto {
    private Ticket ticket;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
