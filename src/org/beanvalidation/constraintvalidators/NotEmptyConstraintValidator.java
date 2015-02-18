package org.beanvalidation.constraintvalidators;

import org.beanvalidation.annotations.NotEmpty;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by bakhtiar.galib on 2/11/15.
 */
public class NotEmptyConstraintValidator implements ConstraintValidator<NotEmpty, String> {

    @Override
    public void initialize(NotEmpty notEmpty) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext ctx) {

        if (value != null && value.length() > 0)
            return true;

        return false;
    }

}
