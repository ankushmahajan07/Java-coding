package org.example.service;

/**
 * Implementation should define ruleb based validation logic.
 */
public interface PasswordValidator
{
    /**
     * Validates given password.
     * @param password
     * @throws Exception
     */
    public void validate(String password) throws Exception;
}
