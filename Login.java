/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.login;

/**
 *
 * @author PC
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


/**
 *
 * @author PC
 */
import java.util.Scanner;


public class Login {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("\n---Registration---");
        String firstName;
        String lastName;
        String userName;
        String password;
        String cellphoneNumber;
        
       
        System.out.print("Enter first name: ");
        firstName = input.next();
        
        System.out.print("Enter last name: ");
        lastName = input.next();
        
        // Username 
        //https://www.youtube.com/watch?v=eyp_1E1bCmI
        System.out.print("Enter Username: ");
        userName = input.next();
        
        if (userName.length() <=5 && userName.contains("_")){
            } else {
            System.out.println("Username is not correctly formatted; please ensure that your username contains and underscore and is no more than five characters in length");
            
        }
        System.out.print("Enter your password: ");
        password = input.next();
        
        //Regex
        //https://www.youtube.com/watch?v=eyp_1E1bCmI
        String regex = "^(?=.*[a-zA-Z])(?=.*\\d)(?=.*[@$!%*?&]).{8,}$";
        if (password.matches(regex)) {
            }else {
            System.out.println("Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character");
            }
        
        System.out.print("Enter cell phone number: ");
        cellphoneNumber = input.next();
        
        //https://www.youtube.com/watch?v=NlCF54RIq1k
        if (cellphoneNumber.matches("^\\+27\\d{9}$")) {
            }else{
            System.out.println("Cell phone number incorrectly formatted or does not contain international code");
        }
        System.out.println("User successfully registered");
        
        
        System.out.println("\n---Login---");
        // Stored credentials
        //https://www.youtube.com/watch?v=E56vV50z5t0&t=1s
        String storedUsername;
        String storedPassword;
        String storedfirstName;
        String storedlastName ;

        Scanner scanner = new Scanner(System.in);

        //Check credentials
        System.out.print("Enter username: ");
        String enteredUsername = scanner.nextLine();

        System.out.print("Enter password: ");
        String enteredPassword = scanner.nextLine();

        // Check credentials
        if (enteredUsername.equals(userName) && enteredPassword.equals(password)) {
            System.out.println("Welcome " + firstName + " " + lastName + ", nice to see you again.");
        } else {
            System.out.println("Password incorrect, please try again.");
        }
    }
}




