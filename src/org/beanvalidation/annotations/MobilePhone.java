package org.beanvalidation.annotations;

import org.beanvalidation.constraintvalidators.MobilePhoneConstraintValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;


/**
 * Created by bakhtiar.galib on 2/11/15.
 */
@Documented
@Constraint(validatedBy = {MobilePhoneConstraintValidator.class})
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MobilePhone {

    String message() default "INVALID MOBILE PHONE NUMBER";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
