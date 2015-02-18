package org.beanvalidation.tests.beans;

import org.beanvalidation.annotations.Email;
import org.beanvalidation.annotations.Password;

/**
 * Created by bakhtiar.galib on 2/18/15.
 */
public class LoginCredintials {

    @Email
    private String email;

    @Password(message = "PASSWORD HAS TO BE AT LEAST 3 CHARS LONG")
    private String password;

    public LoginCredintials(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
