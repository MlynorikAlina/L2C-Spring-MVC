package com.demoapp.validation;

import com.demoapp.validation.validators.CourseCodeValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeValidator.class)
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
    public String[] value() default {"LUV"};

    public String message() default "must start from LUV";

    public Class<?>[] groups() default {};

    public Class<? extends Payload>[] payload() default {};
}
