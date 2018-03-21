package pl.krzysiek.olejnik.dmkatalogue.validator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = MethodNameValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodName {

	String message() default "Nazwa metody nie powinna być dłuższa niż 160 znaków";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
	
}
