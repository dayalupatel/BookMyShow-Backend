package Class.Project.BookMyShow.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Class.Project.BookMyShow.Model.TheaterSeatEntity;

public interface TheaterSeatRepository extends JpaRepository<TheaterSeatEntity, Integer> {
    
}
