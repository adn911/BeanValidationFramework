package org.beanvalidation.constraintvalidators;

import org.beanvalidation.annotations.Date;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.text.SimpleDateFormat;

/**
 * Created by bakhtiar.galib on 2/11/15.
 */
public class DateConstraintValidator implements ConstraintValidator<Date, String> {

    private Date date;

    @Override
    public void initialize(Date date) {
        this.date = date;
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext ctx) {

        if (value != null && isValidDate(value)) {
            return true;
        }

        return false;
    }

    public boolean isValidDate(String dateString) {

        boolean valid = true;

        try {
            SimpleDateFormat dateFormatter = new SimpleDateFormat(date.format());
            dateFormatter.setLenient(false);

            if (dateFormatter.parse(dateString) == null)
                valid = false;

        } catch (Exception ex) {

            valid = false;
        }

        return valid;
    }

}
