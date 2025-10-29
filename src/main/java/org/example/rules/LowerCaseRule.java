package org.example.rules;

import org.example.model.ValidationResult;

/**
 * Checks that password contains at least one lower case letter.
 */
public class LowerCaseRule implements PasswordRules {
    @Override
    public ValidationResult validate(String password) {

        if(!password.matches(".*[a-z].*")){

            return new ValidationResult(false,"Password must contain at least one lower case letter");
        }
        return new ValidationResult(true,"OK");
    }
}
