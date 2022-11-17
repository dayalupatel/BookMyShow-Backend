package Backend.Project.BookMyShow.Service;

import Backend.Project.BookMyShow.Dto.BookTicketRequestDto;
import Backend.Project.BookMyShow.Dto.TicketDto;

public interface TicketService {
    // Get a Ticket
    TicketDto getTicket(int id);

    // Booking a Ticket
    TicketDto bookTicket(BookTicketRequestDto bookTicketRequestDto);
}
