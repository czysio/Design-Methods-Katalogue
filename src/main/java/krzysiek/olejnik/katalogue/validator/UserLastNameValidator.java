package krzysiek.olejnik.katalogue.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UserLastNameValidator implements ConstraintValidator<UserLastName, String> {
		
	@Override
	public void initialize(UserLastName lastName) {
		
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext cvc) {
		return value.length() > 2 && value.matches("[A-Z][a-z]+");
	}

}
