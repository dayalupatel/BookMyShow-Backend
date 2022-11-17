package Backend.Project.BookMyShow.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Backend.Project.BookMyShow.Model.TicketEntity;

public interface TicketRepository extends JpaRepository<TicketEntity,Integer> {
    
}
