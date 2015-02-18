package org.beanvalidation.constraintvalidators;

import org.beanvalidation.annotations.Length;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by bakhtiar.galib on 2/11/15.
 */
public class LengthConstraintValidator implements ConstraintValidator<Length, String> {

    private Length length;

    @Override
    public void initialize(Length length) {
        this.length = length;
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext ctx) {

        if (value.length() >= length.min() && value.length() <= length.max()) {
            return true;
        }
        return false;
    }

}
