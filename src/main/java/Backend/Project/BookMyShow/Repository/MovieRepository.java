package Backend.Project.BookMyShow.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Backend.Project.BookMyShow.Model.MovieEntity;

public interface MovieRepository extends JpaRepository<MovieEntity, Integer> {
    
}
