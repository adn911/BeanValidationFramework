package org.beanvalidation.utils;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.lang.reflect.Field;
import java.util.Set;

/**
 * Created by bakhtiar.galib on 2/18/15.
 */
public class ConstraintViolationChecker {


    public static void checkConstraintViolations(Object object) throws IllegalAccessException, InstantiationException {

        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

        Field[]fields = object.getClass().getDeclaredFields();

        Set<ConstraintViolation<Object>> constraints = validator
                .validate(object);

        for(Field field:fields){

            if(!field.getType().isPrimitive()){

                field.setAccessible(true);
                checkConstraintViolations(field.get(object));
            }
        }

        for (ConstraintViolation<Object> constraint : constraints) {

            System.out.println(constraint.getPropertyPath() + " " + constraint.getMessage());
        }

    }
}
