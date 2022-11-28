package Backend.Project.BookMyShow.Converter;

import Backend.Project.BookMyShow.Dto.TicketDto;
import Backend.Project.BookMyShow.Model.TicketEntity;

public class TicketConverter {

    public static TicketDto convertEntityToDto(TicketEntity ticket) {
        return TicketDto.builder()
                .id(ticket.getId())
                .amount(ticket.getAmount())
                .alotedSeats(ticket.getAllotedSeats()).build();
    }
}
