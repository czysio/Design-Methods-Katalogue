package pl.krzysiek.olejnik.dmkatalogue.utility;

import pl.krzysiek.olejnik.dmkatalogue.model.User;

public interface UserService {
	
	void save(User user);
	User findByUsername(String username);

}
