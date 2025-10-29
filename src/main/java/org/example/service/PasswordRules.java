package org.example.service;

import org.example.model.ValidationResult;

public interface PasswordRules {
    ValidationResult validate(String password);
}
