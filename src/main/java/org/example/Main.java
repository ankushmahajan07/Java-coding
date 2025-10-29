package org.example;

import org.example.service.PasswordValidator;
import org.example.service.PasswordValidatorImpl;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        PasswordValidator validator=new PasswordValidatorImpl();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Password to Validate : ");
        String password = sc.nextLine();
        try{
            validator.validate(password);
            System.out.print("Password is Valid");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}