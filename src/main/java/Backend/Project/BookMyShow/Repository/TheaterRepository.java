package Backend.Project.BookMyShow.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Backend.Project.BookMyShow.Model.TheaterEntity;

public interface TheaterRepository extends JpaRepository<TheaterEntity,Integer> {
    
}
