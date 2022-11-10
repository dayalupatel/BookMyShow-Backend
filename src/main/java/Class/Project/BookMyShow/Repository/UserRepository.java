package Class.Project.BookMyShow.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Class.Project.BookMyShow.Model.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer>{
    
}
