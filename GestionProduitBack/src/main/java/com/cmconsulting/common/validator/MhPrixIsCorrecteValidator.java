package com.cmconsulting.common.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MhPrixIsCorrecteValidator implements ConstraintValidator<MhPrixIsCorrecte, Float> {


    @Override
    public void initialize(MhPrixIsCorrecte constraintAnnotation) {
    }

    @Override
    public boolean isValid(Float prix, ConstraintValidatorContext constraintValidatorContext) {
        if(prix<0)return false;
        return true;
    }

}
