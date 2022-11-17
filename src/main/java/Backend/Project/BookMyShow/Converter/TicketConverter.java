package Backend.Project.BookMyShow.Converter;

import Backend.Project.BookMyShow.Dto.TicketDto;
import Backend.Project.BookMyShow.Model.TicketEntity;

public class TicketConverter {
    // public static TicketEntity convertDtoToEntity(TicketDto ticketDto) {
    //     return TicketEntity.builder().name(userDto.getName()).mobileNo(userDto.getMobileNo()).build();
    //     return null;
    // }

    public static TicketDto convertEntityToDto(TicketEntity ticket) {
        return TicketDto.builder()
                .id((int)ticket.getId())
                .amount(ticket.getAmount())
                .alotedSeat(ticket.getAllotedSeats()).build();
    }
}
