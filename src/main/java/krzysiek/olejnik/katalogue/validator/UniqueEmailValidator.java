package krzysiek.olejnik.katalogue.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import krzysiek.olejnik.katalogue.repository.UserRepository;

public class UniqueEmailValidator implements ConstraintValidator<String, UniqueEmail> {

	@Autowired
	UserRepository userRepository;

	@Override
	public void initialize(UniqueEmail constraintAnnotation) {

	}
	
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if(userRepository.findOneByEmail(value) == null) {
			return true;
		}
			return false;
	}

}
