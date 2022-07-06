package com.demoapp.validation.validators;

import com.demoapp.validation.CourseCode;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeValidator implements ConstraintValidator<CourseCode, String> {
    private String[] prefix;
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        boolean result = true;
        if(s != null){
            for(String pref : prefix){
                result = s.startsWith(pref);
                if(result)
                    break;
            }
        }
        return result;
    }

    @Override
    public void initialize(CourseCode constraintAnnotation) {
        prefix = constraintAnnotation.value();
    }
}
