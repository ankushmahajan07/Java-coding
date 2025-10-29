package org.example.service;

import org.example.model.ValidationResult;
import org.example.rules.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Implements PasswordValidator to validate passwords based on
 * predefined rules such as length,uppercase,lowercase, and numbers.
 */
public class PasswordValidatorImpl implements  PasswordValidator{

    private final List<PasswordRules> rules= Arrays.asList(
            new NotNullRule(),
            new LengthRule(),
            new UpperCaseRule(),
            new LowerCaseRule(),
            new NumberValidationRule()
    );

    /**
     * Validates the given password using set of predefined rules.
     * @param password The password String to validate.
     * @throws Exception if any validation rule fails.
     */
    @Override
    public void validate(String password) throws Exception {

        List<ValidationResult>resuts=rules.parallelStream().map(rule-> rule.validate(password))
        .collect(Collectors.toList());

 List<String>failedMessages = resuts.stream().filter(result ->!result.isValid())
        .map(ValidationResult::getMessage).collect(Collectors.toList());

if (!failedMessages.isEmpty()){
    throw new Exception("Password invalid : " + String.join(", ",failedMessages));
}
    }

}

