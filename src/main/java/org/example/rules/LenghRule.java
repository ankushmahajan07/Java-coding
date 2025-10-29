package org.example.rules;

import org.example.model.ValidationResult;
import org.example.service.PasswordRules;

public class LenghRule implements PasswordRules {
    @Override
    public ValidationResult validate(String password) {
        if(password==null||password.length()<=8){
            return new ValidationResult(false,"Password must be longerthan 8 characters");
        }
        return new ValidationResult(true,"OK");


    }
}
