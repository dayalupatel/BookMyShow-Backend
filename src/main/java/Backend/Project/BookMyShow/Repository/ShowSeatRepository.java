package Backend.Project.BookMyShow.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Backend.Project.BookMyShow.Model.ShowSeatsEntity;

public interface ShowSeatRepository extends JpaRepository<ShowSeatsEntity,Integer> {
    
}
