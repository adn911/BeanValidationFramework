package org.beanvalidation.constraintvalidators;

import org.beanvalidation.annotations.Password;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by bakhtiar.galib on 2/11/15.
 */
public class PasswordConstraintValidator implements ConstraintValidator<Password, String> {

    Password password;

    @Override
    public void initialize(Password password) {
        this.password = password;
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext ctx) {

        return isValidPassword(value);
    }

    private boolean isValidPassword(String value) {

        return value != null && value.length() >= password.minLength()
                && value.length() <= password.maxLength() && value.matches(password.pattern());
    }

}
