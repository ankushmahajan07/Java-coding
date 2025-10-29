package org.example.rules;

import org.example.model.ValidationResult;

/**
 * Checks if the password Length is greater than 8 characters.
 */

public class LenghRule implements PasswordRules {
    @Override
    public ValidationResult validate(String password) {
        if(password==null||password.length()<=8){
            return new ValidationResult(false,"Password must be longerthan 8 characters");
        }
        return new ValidationResult(true,"OK");


    }
}
