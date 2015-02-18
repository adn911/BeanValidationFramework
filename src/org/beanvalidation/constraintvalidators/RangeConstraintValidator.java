package org.beanvalidation.constraintvalidators;

import org.beanvalidation.annotations.Range;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by bakhtiar.galib on 2/11/15.
 */
public class RangeConstraintValidator implements ConstraintValidator<Range, Integer> {

    private Range range;

    @Override
    public void initialize(Range range) {
        this.range = range;
    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext ctx) {

        if (value >= range.min() && value <= range.max()) {
            return true;
        }
        return false;
    }

}
