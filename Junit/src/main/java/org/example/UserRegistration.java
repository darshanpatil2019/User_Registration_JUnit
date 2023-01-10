package org.example;

import java.util.regex.Pattern;

public class UserRegistration {
    private static final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";

    public boolean validateFirstName(String firstName) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matches(NAME_PATTERN, firstName);
    }

    public boolean validateLastName(String lastName) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matches(NAME_PATTERN, lastName);
    }

    public boolean validateEmailID(String emailID) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matches(EMAIL_PATTERN, emailID);
    }
}







