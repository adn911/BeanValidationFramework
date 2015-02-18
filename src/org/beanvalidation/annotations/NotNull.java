package org.beanvalidation.annotations;

import org.beanvalidation.constraintvalidators.NotNullConstraintValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * Created by bakhtiar.galib on 2/17/15.
 */
@Documented
@Constraint(validatedBy = {NotNullConstraintValidator.class})
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface NotNull {

    String message() default "CAN NOT BE NULL";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
