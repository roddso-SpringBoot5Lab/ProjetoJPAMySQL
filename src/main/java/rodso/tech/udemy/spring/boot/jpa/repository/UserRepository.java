package rodso.tech.udemy.spring.boot.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import rodso.tech.udemy.spring.boot.jpa.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByName(String name);

	User findByNameIgnoreCase(String name);
	
	List<User> findByEmail(String email);

	@Query("select u from User u where u.name like %?1%")
	User findByNameLike(String name);
	

	
}
