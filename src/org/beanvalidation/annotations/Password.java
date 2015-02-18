package org.beanvalidation.annotations;

import org.beanvalidation.constraintvalidators.PasswordConstraintValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;


/**
 * Created by bakhtiar.galib on 2/11/15.
 */
@Documented
@Constraint(validatedBy = {PasswordConstraintValidator.class})
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Password {

    String message() default "INVALID PASSWORD";

    int minLength() default 3;

    int maxLength() default 99;

    String pattern() default ".*";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
