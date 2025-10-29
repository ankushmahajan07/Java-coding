package org.example.rules;

import org.example.model.ValidationResult;

public class NumberValidationRule implements PasswordRules {
    @Override
    public ValidationResult validate(String password) {

        if(!password.matches(".*\\d.*")){

            return new ValidationResult(false,"Password must contain at least one uppercase number");
        }
        return new ValidationResult(true,"OK");
    }
}

