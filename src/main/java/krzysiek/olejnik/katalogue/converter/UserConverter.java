package krzysiek.olejnik.katalogue.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import krzysiek.olejnik.katalogue.model.User;
import krzysiek.olejnik.katalogue.repository.UserRepository;



public class UserConverter implements Converter<String, User> {

	@Autowired
	UserRepository userRepository;

	@Override
	public User convert(String id) { 
		return userRepository.findOne(Long.parseLong(id));
	}
}
