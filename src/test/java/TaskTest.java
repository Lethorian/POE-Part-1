/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
import com.mycompany.registration.Task;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {

    @Test
    public void testCheckTaskDescription() {
        Task task1 = new Task("Login Feature", "Create Login to authenticate users", "Robyn Harrison", 8, 1);
        Task task2 = new Task("Add Task feature", "Create add task feature to add task users", "Mike Smith", 10, 2);

        assertTrue(task1.checkTaskDescription(), "Task description should be valid (<= 50 characters)");
        assertTrue(task2.checkTaskDescription(), "Task description should be valid (<= 50 characters)");
    }

    @Test
    public void testCreateTaskID() {
        Task task1 = new Task("Login Feature", "Create Login to authenticate users", "Robyn Harrison", 8, 1);
        Task task2 = new Task("Add Task feature", "Create add task feature to add task users", "Mike Smith", 10, 2);

        assertEquals("LO:1:SON", task1.createTaskID(), "Task ID should match format: first 2 letters of Task Name, Task Number, last 3 letters of Developer's last name");
        assertEquals("AD:2:ITH", task2.createTaskID(), "Task ID should match format: first 2 letters of Task Name, Task Number, last 3 letters of Developer's last name");
    }

    @Test
    public void testPrintTaskDetails() {
        Task task1 = new Task("Login Feature", "Create Login to authenticate users", "Robyn Harrison", 8, 1);
        Task task2 = new Task("Add Task feature", "Create add task feature to add task users", "Mike Smith", 10, 2);

        String expectedDetails1 = """
                                  Task Status: To Do
                                  Developer Details: Robyn Harrison
                                  Task Number: 1
                                  Task Name: Login Feature
                                  Task Description: Create Login to authenticate users
                                  Task ID: LO:1:SON
                                  Duration: 8 hours""";

        String expectedDetails2 = """
                                  Task Status: Doing
                                  Developer Details: Mike Smith
                                  Task Number: 2
                                  Task Name: Add Task feature
                                  Task Description: Create add task feature to add task users
                                  Task ID: AD:2:ITH
                                  Duration: 10 hours""";

        assertEquals(expectedDetails1, task1.printTaskDetails(), "Task details should be printed in correct format");
        assertEquals(expectedDetails2, task2.printTaskDetails(), "Task details should be printed in correct format");
    }

    @Test
    public void testReturnTotalHours() {
        Task task1 = new Task("Login Feature", "Create Login to authenticate users", "Robyn Harrison", 8, 1);
        Task task2 = new Task("Add Task feature", "Create add task feature to add task users", "Mike Smith", 10, 2);

        assertEquals(18, Task.returnTotalHours(), "Total hours should be the sum of durations of all tasks");
    }
}

