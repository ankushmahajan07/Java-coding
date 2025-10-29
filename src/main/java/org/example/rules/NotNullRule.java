package org.example.rules;

import org.example.model.ValidationResult;

/**
 * Checks that password must not null or empty.
 */

public class NotNullRule implements PasswordRules {
    @Override
    public ValidationResult validate(String password) {
        if (password == null || password.isEmpty()) {
            return new ValidationResult(false, "Password must not be null or empty");

        }
        return new ValidationResult(true, "OK");
    }
}
