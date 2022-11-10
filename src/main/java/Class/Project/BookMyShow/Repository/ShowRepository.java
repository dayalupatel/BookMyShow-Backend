package Class.Project.BookMyShow.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Class.Project.BookMyShow.Model.ShowEntity;

public interface ShowRepository extends JpaRepository<ShowEntity, Integer> {
    
}
