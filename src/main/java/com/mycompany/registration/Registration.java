/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registration;


import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class Registration {

  static Login loginObject = new Login();
    
  
    
    
   static Scanner input = new Scanner(System.in);
    
    public static String Firstname = ""; 
    public static String Surname = ""; 
    private static String Password = " ";
    private static String Username = ""; 
    
    
   
    /*this is the promt that will ask for a username*/
    public static void setUserName(){
        Username = JOptionPane.showInputDialog("Please enter a username that contains an under score (_) and is no more than 5 letters");
        
    }
    
    public static String getUserName(){
        
        return Username;
    }
    /*this is the promt that will ask for a new password*/
    public static void setPassword(){
        Password = JOptionPane.showInputDialog("Please enter a password that has a minimum of 8 characters, has a special character, has a number and has an uppercase ");
    }
    
    public static String getPassword(){
        
        return Password;
    }
    /*this is the promt that will ask for your first name*/
    public static void setFirstName(){
        Firstname = JOptionPane.showInputDialog("What is your first name");
    }
    
    public static String getFirstName(){
        
        return Firstname;
    }
    /*this is the promt that will ask for your last name*/
    public static void setSurname(){
        Surname = JOptionPane.showInputDialog("What is your surname");
    }
    
    public static String getSurname(){
        
        return Surname;
    /*main method and declarations*/
    }
    public static void main(String[] args) {
       setFirstName();
       setSurname();
       setUserName();
       setPassword();
      
         
       
         loginObject.registerUser();
         
         JOptionPane.showMessageDialog(null,loginObject.returnLoginStatus());
        
    }
    
}
