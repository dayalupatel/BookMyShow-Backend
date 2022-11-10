package Class.Project.BookMyShow.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Class.Project.BookMyShow.Model.MovieEntity;

public interface MovieRepository extends JpaRepository<MovieEntity, Integer> {
    
}
