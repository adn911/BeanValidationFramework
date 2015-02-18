package org.beanvalidation.constraintvalidators;

import org.beanvalidation.annotations.NotNull;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by bakhtiar.galib on 2/11/15.
 */
public class NotNullConstraintValidator implements ConstraintValidator<NotNull, Object> {

    @Override
    public void initialize(NotNull notNull) {
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext ctx) {

        if (value == null)
            return false;

        return true;
    }

}
