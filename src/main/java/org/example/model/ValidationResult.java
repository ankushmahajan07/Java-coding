package org.example.model;

/**
 * This class represents the outcome of validating
 * a password or any user input.
 */
public class ValidationResult {
    private final boolean valid;
    private final String message;

    public ValidationResult(boolean valid,String message){

        this.valid=valid;
        this.message=message;
    }
    public boolean isValid(){
        return valid;
    }
    public String getMessage(){return message;}


}
