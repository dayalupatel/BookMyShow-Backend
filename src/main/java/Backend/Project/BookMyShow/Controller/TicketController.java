package Backend.Project.BookMyShow.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Backend.Project.BookMyShow.Dto.BookTicketRequestDto;
import Backend.Project.BookMyShow.Dto.TicketDto;
import Backend.Project.BookMyShow.Model.TicketEntity;
import Backend.Project.BookMyShow.Service.Impl.TicketServiceImpl;

@RestController
@RequestMapping("/ticket")
public class TicketController {
    @Autowired
    TicketServiceImpl ticketService;

    @GetMapping("/get-ticket")
    public ResponseEntity<TicketEntity> getTicketById(@RequestParam("id") int id) {
        return new ResponseEntity<>(ticketService.getTicket(id), HttpStatus.FOUND);
    }

    @PutMapping("/ticket-booking")
    public ResponseEntity<TicketDto> bookATicket(@RequestBody BookTicketRequestDto bookTicketRequestDto) {
        return new ResponseEntity<>(ticketService.bookTicket(bookTicketRequestDto), HttpStatus.CREATED);
    }
}
