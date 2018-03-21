package pl.krzysiek.olejnik.dmkatalogue.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pl.krzysiek.olejnik.dmkatalogue.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
		
	User findByEmail(String email);
	User findByUsername(String username);
	@Query("SELECT u.email FROM User u WHERE email=?1")
	String findUserEmailByEmail(String email);
	@Query("SELECT u.username FROM User u WHERE username=?1")
	String findUserUsernameByUsername(String username);
	
}
