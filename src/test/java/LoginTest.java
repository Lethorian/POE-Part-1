/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.registration.Login;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class LoginTest {
    
    public LoginTest() {
    }
    
   

    /**
     * Test of checkUserName method, of class Login.
     */
    @Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        String username = "kyl_l";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkUserName();
        assertEquals(expResult, result, "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.");
        
    }

    /**
     * Test of checkPasswordComplexity method, of class Login.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String password = "Ch&&sec@ke99!"; 
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity();
        assertEquals(expResult, result,"Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number, and a special character.");
        
    }

    /**
     * Test of registerUser method, of class Login.
     */

    

    /**
     * Test of loginUser method, of class Login.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.loginUser();
        assertEquals(expResult, result);
        
    }


        
    }
    

