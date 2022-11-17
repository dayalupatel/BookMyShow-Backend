package Backend.Project.BookMyShow.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Backend.Project.BookMyShow.Model.TheaterSeatEntity;

public interface TheaterSeatRepository extends JpaRepository<TheaterSeatEntity, Integer> {
    
}
