package org.example.rules;

import org.example.model.ValidationResult;
import org.example.service.PasswordRules;

public class LoweCaseRule implements PasswordRules {
    @Override
    public ValidationResult validate(String password) {

        if(!password.matches(".*[a-z].*")){

            return new ValidationResult(false,"Password must contain at least one lower case letter");
        }
        return new ValidationResult(true,"OK");
    }
}
