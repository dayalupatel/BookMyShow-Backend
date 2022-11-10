package Class.Project.BookMyShow.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Class.Project.BookMyShow.Model.TheaterEntity;

public interface TheaterRepository extends JpaRepository<TheaterEntity,Integer> {
    
}
