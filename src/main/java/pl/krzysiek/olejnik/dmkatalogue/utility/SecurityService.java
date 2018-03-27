package pl.krzysiek.olejnik.dmkatalogue.utility;

public interface SecurityService {

	String findLoggedInUsername();
	void autologin(String username, String password);
	
}
