/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registration;

/**
 *
 * @author RC_Student_lab
 */
import javax.swing.JOptionPane;


public class Login{
    String enteredUserName; 
    String enteredPassword; 
      
    
  
    /*This method means that every username has a minimum of five letters and an underscore.*/
    public  boolean checkUserName(){
        
        return (Registration.getUserName().contains("_") && Registration.getUserName().length() <= 5);
        
    }
    
    /*This method makes sure that passwords comply to the following guidelines for password complexity; the password needs to fulfill the requirements. */
    public boolean checkPasswordComplexity(){
       
        boolean isUpper = false ;        
        boolean isSpecialCharacter = false ;
        boolean isNumber = false;
        char currentCharacter; 
        
          if (Registration.getPassword().length() >= 8) {
               
            
            
            for (int i = 0; i < Registration.getPassword().length(); i++) {
              
                currentCharacter = Registration.getPassword().charAt(i);  
                if (Character.isUpperCase(currentCharacter)) {
                    isUpper = true;
                } else if (Character.isDigit(currentCharacter)) {
                    isNumber = true;
                } else if (!(Character.isLetterOrDigit(currentCharacter))) {
                    isSpecialCharacter = true;
                }
                
                }
            }

      
    
           return (isUpper && isNumber && isSpecialCharacter);   
    }
   
   /*This method provides the required registration messaging, indicating whether or not the username and password are formatted correctly.*/
 public String registerUser(){
     
     String nameoutput;
     String passwordoutput;
     
     if (checkUserName()){
         nameoutput = "Username successfully captured; ";
     }
     else{
         nameoutput = "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length";
     }
     
     if(checkPasswordComplexity()){
         passwordoutput = "Password successfully captured.";
     }
     else{
        passwordoutput = " Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character";
     }
    return passwordoutput + "\n" + nameoutput;
 }
 /*Using this method, you may be sure that the login information you supplied is the same as the one you recorded when you registered. */ 
 public boolean loginUser(){
     
   
      
    
     enteredUserName =JOptionPane.showInputDialog("Enter the user name you used to create an account");
       
      enteredPassword =JOptionPane.showInputDialog("Enter the password you used to create an account");
      
     
     
     
     return Registration.getUserName().equals(enteredUserName) && Registration.getPassword().equals(enteredPassword);
           
 }
 
  /*This method provides the required message for either a successful or unsuccessful login.*/
 public String returnLoginStatus(){
      
      
      
    
        if(loginUser()){
        return "Welcome " + Registration.Firstname + " " + Registration.Surname + " it is great to see you again.";
    }
    else{
        return "Username or password incorrect, please try again.";
 }
}
}
