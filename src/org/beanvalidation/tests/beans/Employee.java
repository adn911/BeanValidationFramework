package org.beanvalidation.tests.beans;

import org.beanvalidation.annotations.*;

/**
 * Created by bakhtiar.galib on 2/17/15.
 */
public class Employee {

    @NotEmpty
    @NotNull
    private String name;

    private LoginCredintials loginCredintials;


    @MobilePhone
    private String phone;

    public LoginCredintials getLoginCredintials() {
        return loginCredintials;
    }

    public void setLoginCredintials(LoginCredintials loginCredintials) {
        this.loginCredintials = loginCredintials;
    }

    @Range(min = 18, max = 50, message = "AGE HAS TO BE BETWEEN 18 AND 50")
    private int age;

    @Date(format = "dd-MM-yyyy")
    private String hireDate;


    public Employee() {
    }

    public Employee(String name, String email, String password, String phone, String hireDate) {
        this.name = name;
        this.phone = phone;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
