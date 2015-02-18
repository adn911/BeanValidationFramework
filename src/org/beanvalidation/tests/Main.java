package org.beanvalidation.tests;


import org.beanvalidation.tests.beans.Employee;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.text.ParseException;
import java.util.Set;

/**
 * Created by bakhtiar.galib on 2/11/15.
 */
public class Main {


    public static void main(String[] args) throws ParseException {

        Employee employee = new Employee();

        employee.setName("");
        employee.setPassword("12");
        employee.setPhone("01923826663");
        employee.setEmail("bakhtiar.galib@therapservices.com");
        employee.setAge(15);
        employee.setHireDate("23-1992-02");

        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        Set<ConstraintViolation<Employee>> constraints = validator
                .validate(employee);

        for (ConstraintViolation<Employee> constraint : constraints) {

            System.out.println(constraint.getPropertyPath() + " " + constraint.getMessage());
        }

    }
}
