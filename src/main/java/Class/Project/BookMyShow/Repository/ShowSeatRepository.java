package Class.Project.BookMyShow.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Class.Project.BookMyShow.Model.ShowSeatsEntity;

public interface ShowSeatRepository extends JpaRepository<ShowSeatsEntity,Integer> {
    
}
