package org.beanvalidation.constraintvalidators;

import org.beanvalidation.annotations.MobilePhone;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by bakhtiar.galib on 2/11/15.
 */
public class MobilePhoneConstraintValidator implements ConstraintValidator<MobilePhone, String> {

    private final String phonePattern = "[+]?(88)?01\\d[-]?\\d{8}";

    @Override
    public void initialize(MobilePhone phone) {
    }

    @Override
    public boolean isValid(String phoneField, ConstraintValidatorContext ctx) {

        if (phoneField != null && phoneField.matches(phonePattern)) {
            return true;
        }
        return false;
    }

}
