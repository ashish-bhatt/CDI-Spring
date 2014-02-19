package com.intuit.core;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.NotNull;

@Constraint(validatedBy = {URLValidator.class})
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)

public @interface URL {
	
	String message() default "Malformed URL";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
	
	String protocol() default "";
	String host() default "";
	int port() default -1;
}
