package org.beanvalidation.annotations;

import org.beanvalidation.constraintvalidators.DateConstraintValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;


/**
 * Created by bakhtiar.galib on 2/11/15.
 */
@Documented
@Constraint(validatedBy = {DateConstraintValidator.class})
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Date {

    String message() default "INVALID DATE";

    Class<?>[] groups() default {};

    String format() default "dd-MM-yyyy";

    Class<? extends Payload>[] payload() default {};

}
