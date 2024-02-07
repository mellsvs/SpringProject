package com.folksdev.weather.controller.validation;

import jakarta.persistence.Table;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


@Documented
@Constraint(validatedBy = {CityNameValidator.class})
@Target({METHOD,FIELD,PARAMETER })
@Retention(RUNTIME)

public @interface CityNameConstraint {

    String message() default "invalid city name";

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
