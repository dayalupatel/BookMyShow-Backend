package Backend.Project.BookMyShow.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Backend.Project.BookMyShow.Model.ShowEntity;

public interface ShowRepository extends JpaRepository<ShowEntity, Integer> {
    
}
