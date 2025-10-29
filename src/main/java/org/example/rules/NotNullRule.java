package org.example.rules;

import org.example.model.ValidationResult;

public class NotNullRule implements PasswordRules {
    @Override
    public ValidationResult validate(String password) {
        if (password == null || password.isEmpty()) {
            return new ValidationResult(false, "Password must not be null or empty");

        }
        return new ValidationResult(true, "OK");
    }
}
