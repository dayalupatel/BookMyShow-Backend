package Backend.Project.BookMyShow.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import Backend.Project.BookMyShow.Model.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer>{
    
}
