package org.beanvalidation.annotations;

import org.beanvalidation.constraintvalidators.RangeConstraintValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;


/**
 * Created by bakhtiar.galib on 2/11/15.
 */
@Documented
@Constraint(validatedBy = {RangeConstraintValidator.class})
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Range {

    String message() default "NOT IN RANGE";

    long min() default Long.MIN_VALUE;

    long max() default Long.MAX_VALUE;

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
