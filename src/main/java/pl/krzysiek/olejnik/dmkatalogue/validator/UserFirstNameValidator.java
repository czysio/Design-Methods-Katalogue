package pl.krzysiek.olejnik.dmkatalogue.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UserFirstNameValidator implements ConstraintValidator<UserFirstName, String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext cvc) {
		return value.length() > 2 && value.matches("[A-Z][a-z]+");
	}
	
	@Override
	public void initialize(UserFirstName firstName) {
	}
	
}
