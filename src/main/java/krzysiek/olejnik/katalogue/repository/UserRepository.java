package krzysiek.olejnik.katalogue.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import krzysiek.olejnik.katalogue.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
		
	User findOneByEmail(String email);
	User findOneByUsername(String username);
	
}
