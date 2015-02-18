package org.beanvalidation.annotations;

import org.beanvalidation.constraintvalidators.LengthConstraintValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;


/**
 * Created by bakhtiar.galib on 2/11/15.
 */
@Documented
@Constraint(validatedBy = {LengthConstraintValidator.class})
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Length {

    String message() default "INVALID RANGE";

    long min() default Long.MIN_VALUE;

    long max() default Long.MAX_VALUE;

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
