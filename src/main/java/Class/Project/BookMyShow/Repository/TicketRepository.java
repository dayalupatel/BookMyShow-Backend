package Class.Project.BookMyShow.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Class.Project.BookMyShow.Model.TicketEntity;

public interface TicketRepository extends JpaRepository<TicketEntity,Integer> {
    
}
