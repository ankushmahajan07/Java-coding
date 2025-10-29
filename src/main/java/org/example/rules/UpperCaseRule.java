package org.example.rules;

import org.example.model.ValidationResult;
/*
 * Checks that password contains at least one Upper case letter.
 */
public class UpperCaseRule implements PasswordRules {
    @Override
    public ValidationResult validate(String password) {

        if(!password.matches(".*[A-Z].*")){

            return new ValidationResult(false,"Password must contain at least one uppercase letter");
        }
        return new ValidationResult(true,"OK");
    }
}
