package org.beanvalidation.constraintvalidators;

import org.beanvalidation.annotations.Email;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by bakhtiar.galib on 2/11/15.
 */
public class EmailConstraintValidator implements ConstraintValidator<Email, String> {

    private final String emailPattern = "^[a-zA-z0-9._%]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,4}$";

    @Override
    public void initialize(Email email) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext ctx) {

        if (value != null && value.matches(emailPattern)) {
            return true;
        }
        return false;
    }

}
