/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.registration.Registration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class RegistrationTest {
    
    public RegistrationTest() {
    }
    
   

   
    
    

    /**
     * Test of getUserName method, of class Registration.
     */
    @Test
    public void testGetUserName() {
        System.out.println("getUserName");
        String expResult = "kyl_l";
        String result = Registration.getUserName();
        assertEquals(expResult, result);
      
        
    }

   

    /**
     * Test of getPassword method, of class Registration.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        String expResult = "Ch&&sec@ke99!";
        String result = Registration.getPassword();
        assertEquals(expResult, result);
        
    }

   

    /**
     * Test of getFirstName method, of class Registration.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        String expResult = "Kyle";
        String result = Registration.getFirstName();
        assertEquals(expResult, result);
        
   
    }

  

    /**
     * Test of getSurname method, of class Registration.
     */
    @Test
    public void testGetSurname() {
        System.out.println("getSurname");
        String expResult = "";
        String result = Registration.getSurname();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of main method, of class Registration.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Registration.main(args);
        
    }
    
}
