package org.beanvalidation.annotations;

import org.beanvalidation.constraintvalidators.NotEmptyConstraintValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * Created by bakhtiar.galib on 2/17/15.
 */
@Documented
@Constraint(validatedBy = {NotEmptyConstraintValidator.class})
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface NotEmpty {

    String message() default "CAN NOT BE EMPTY";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
