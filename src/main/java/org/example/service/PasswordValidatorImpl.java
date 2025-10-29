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

//long passed=resuts.stream().filter(ValidationResult::isValid).count();
if (!failedMessages.isEmpty()){
    throw new Exception("Password invalid : " + String.join(", ",failedMessages));
}
/*boolean lengthOK=resuts.stream().filter(r -> r.getMessage().contains("longer than 8")).findFirst()
        .map(ValidationResult::isValid)
        .orElse(true);
        if (!lengthOK) {
            throw new Exception("Password is too short");
        }
        if(passed<3){
            throw new Exception("Password Invalid-less than 3 rules passed");
        }*/

        }




    }

