package com.cmconsulting.common.validator;


import com.cmconsulting.common.enumeration.ErrorsEnum;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target(FIELD)
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = MhPrixIsCorrecteValidator.class)
public @interface MhPrixIsCorrecte {

    ErrorsEnum error() default ErrorsEnum.ERROR_BLOQUANTE;
 //   ErrorsEnum value() ErrorsEnum.ERROR_BLOQUANTE;


    /**
     * @return the error message template.
     */
    String message() default "le prix ne doit pas etre inférieur à zero";

    /**
     * @return the groups the constraint belongs to
     */
    Class<?>[] groups() default {};

    /**
     * @return the payload associated to the constraint
     */
    Class<? extends Payload>[] payload() default {};


}
