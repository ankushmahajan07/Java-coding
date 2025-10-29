package org.example.rules;

import org.example.model.ValidationResult;

/**
 * checks that Password must contain at least one number.
 */
public class NumberValidationRule implements PasswordRules {
    @Override
    public ValidationResult validate(String password) {

        if(!password.matches(".*\\d.*")){

            return new ValidationResult(false,"Password must contain at least one number");
        }
        return new ValidationResult(true,"OK");
    }
}

