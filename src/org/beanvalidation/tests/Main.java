package org.beanvalidation.tests;


import org.beanvalidation.tests.beans.Employee;
import org.beanvalidation.tests.beans.LoginCredintials;
import org.beanvalidation.utils.ConstraintViolationChecker;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.lang.reflect.Field;
import java.text.ParseException;
import java.util.Set;

/**
 * Created by bakhtiar.galib on 2/11/15.
 */
public class Main {


    public static void main(String[] args) throws ParseException, IllegalAccessException, InstantiationException {

        Employee employee = new Employee();

        employee.setName("");
        employee.setLoginCredintials(new LoginCredintials("galib.adann","12"));
        employee.setPhone("01923826663");
        employee.setAge(15);
        employee.setHireDate("23-1992-02");

        ConstraintViolationChecker.checkConstraintViolations(employee);

    }

}
