package org.example.rules;

import org.example.model.ValidationResult;
/**
*This interface representing a password validation rules.
Each implementation defines a specific validation check.
 */
public interface PasswordRules {
    /**
     * valiadtes a given password according to a specific rule.
     * @param password the password to validate
     * @return true if valid, false otherwise
     */
    ValidationResult validate(String password);
}
