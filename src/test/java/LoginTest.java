/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class LoginTest {
    
    public LoginTest() {
    }
    @Test
    public void testCheckUserNameValid(){
        System.out.println("checkserName-Valid");
        String username = "kyl_1";
        Login instance = new Login();
        Boolean expResult = true;
        boolean result = instance.checkUserName(username);
        assertEquals(expResult, result, "Username is not correctl formatted, please ensure your username contains an nderscore and is no longer that 5 charachters long");
    }
    
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
