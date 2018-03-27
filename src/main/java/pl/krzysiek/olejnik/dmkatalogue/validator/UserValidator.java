package pl.krzysiek.olejnik.dmkatalogue.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import pl.krzysiek.olejnik.dmkatalogue.model.User;
import pl.krzysiek.olejnik.dmkatalogue.utility.UserService;

@Component
public class UserValidator implements Validator{
	
	 @Autowired
	 private UserService userService;
	
	@Override
	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		 User user = (User) target;

	        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "NotEmpty");
	        if (user.getUsername().length() < 4 || user.getUsername().length() > 32) {
	            errors.rejectValue("username", "Username powinien zawierać między 4 a 32 znaki");
	        }
	        if (userService.findByUsername(user.getUsername()) != null) {
	            errors.rejectValue("usernameInDatabase", "Ta nazwa użytkownika jest już zajęta");
	        }

	        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty");
	        if (user.getPassword().length() < 8 || user.getPassword().length() > 32) {
	            errors.rejectValue("password", "Hasło powinno zawierać między 8 a 32 znaki");
	        }

	        if (!user.getPasswordConfirm().equals(user.getPassword())) {
	            errors.rejectValue("passwordConfirm", "Hasła do siebie nie pasują");
	        }
	    }
	}