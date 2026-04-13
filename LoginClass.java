/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loginclass;

/**
 *
 * @author PC
 */
 public class LoginClass {

    public static void main(String[] args) {
        
    }
        
    private String firstName;
    private String lastName;
    private String storedUsername;
    private String storedPassword;
    
    // Method to check if username is correctly formatted
    public boolean checkUserName(String username) {
        // Username must contain an underscore and be no more than 5 characters long
        return username.contains("_") && username.length() <= 5;
    }

    // Method to check if password meets complexity requirements
    public boolean checkPasswordComplexity(String password) {
        boolean hasUpperCase = false;
        boolean hasNumber = false;
        boolean hasSpecialChar = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) hasUpperCase = true;
            else if (Character.isDigit(ch)) hasNumber = true;
            else if (!Character.isLetterOrDigit(ch)) hasSpecialChar = true;
        }

        return password.length() >= 8 && hasUpperCase && hasNumber && hasSpecialChar;
    }

    // Method to register a user
    public String registerUser(String username, String password, String firstName, String lastName) {
        if (!checkUserName(username)) {
            return "Username is not correctly formatted. Please ensure it contains an underscore and is no more than 5 characters long.";
        }
        if (!checkPasswordComplexity(password)) {
            return "Password is not correctly formatted. Please ensure it contains at least 8 characters, a capital letter, a number, and a special character.";
        }

        this.storedUsername = username;
        this.storedPassword = password;
        this.firstName = firstName;
        this.lastName = lastName;

        return "User registered successfully.";
    }

    // Method to login a user
    public boolean loginUser(String username, String password) {
        return username.equals(storedUsername) && password.equals(storedPassword);
    }

    // Method to return login status message
    public String returnLoginStatus(String username, String password) {
        if (loginUser(username, password)) {
            return "Welcome " + firstName + " " + lastName + ", it is great to see you again.";
        } else {
            return "Username or password incorrect, please try again.";
        }
   

    
    }
 }

