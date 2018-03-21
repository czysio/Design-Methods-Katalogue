package pl.krzysiek.olejnik.dmkatalogue.validator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = UserLastNameValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface UserLastName {

	String message() default "Imię powinno zaczynać się wielką literą oraz być dłuższe niż 2 znaki";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
	
}
