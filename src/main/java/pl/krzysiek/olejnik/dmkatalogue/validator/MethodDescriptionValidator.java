package pl.krzysiek.olejnik.dmkatalogue.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import pl.krzysiek.olejnik.dmkatalogue.repository.UserRepository;

public class MethodDescriptionValidator implements ConstraintValidator<MethodDescription, String> {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public void initialize(MethodDescription methodDescription) {
		
	}
	
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		return value.length() <= 160;
	}

}
