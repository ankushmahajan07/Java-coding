package org.example.service;

import org.example.model.ValidationResult;
import org.example.rules.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PasswordValidatorImpl implements  PasswordValidator{
    private final List<PasswordRules> rules= Arrays.asList(
            new NotNullRule(),
            new LenghRule(),
            new UpperCaseRule(),
            new LoweCaseRule(),
            new NumberValidationRule()
    );

    @Override
    public void validate(String password) throws Exception {
List<ValidationResult>resuts=rules.parallelStream().map(rule-> rule.validate(password))
        .collect(Collectors.toList());
long passed=resuts.stream().filter(ValidationResult::isValid).count();

boolean lengthOK=resuts.stream().filter(r -> r.getMessage().contains("longer than 8")).findFirst().map(ValidationResult::isValid)
        .orElse(true);
        if (!lengthOK) {
            throw new Exception("Password is too short");
        }
        if(passed<3){
            throw new Exception("Password Invalid-less than 3 rules passed");
        }
        System.out.println("Password is Valid");
        }


    }

