package Backend.Project.BookMyShow.Service;

import Backend.Project.BookMyShow.Dto.BookTicketRequestDto;
import Backend.Project.BookMyShow.Dto.TicketDto;
import Backend.Project.BookMyShow.Model.TicketEntity;

public interface TicketService {
    // Get a Ticket
    TicketEntity getTicket(int id);

    // Booking a Ticket
    TicketDto bookTicket(BookTicketRequestDto bookTicketRequestDto);
}
