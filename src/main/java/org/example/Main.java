package org.example;

import org.example.service.PasswordValidator;
import org.example.service.PasswordValidatorImpl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        PasswordValidator validator=new PasswordValidatorImpl();
        try{
            validator.validate("Abcd1234");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}