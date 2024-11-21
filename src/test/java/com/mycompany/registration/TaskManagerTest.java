/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.registration;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 *
 * @author RC_Student_lab
 */
public class TaskManagerTest {
    
    public TaskManagerTest() {
    }
    
   
    /**
     * Test of addTask method, of class TaskManager.
     */
    @ParameterizedTest
    
    public void testAddTask() {
        System.out.println("addTask");
        String developer = "Mike Smith";
        String taskName = "Create Login";
        String taskID = "CL:1:SMI";
        int duration = 5;
        String status = "To Do";
        TaskManager instance = new TaskManager();
        instance.addTask(developer, taskName, taskID, duration, status);
        
        
    }

    /**
     * Test of displayTasksByStatus method, of class TaskManager.
     */
    @Test
    public void testDisplayTasksByStatus() {
        System.out.println("displayTasksByStatus");
        String status = "To Do";
        TaskManager instance = new TaskManager();
        instance.displayTasksByStatus(status);
        
    }

    /**
     * Test of displayLongestTask method, of class TaskManager.
     */
    @Test
    public void testDisplayLongestTask() {
        System.out.println("displayLongestTask");
        TaskManager instance = new TaskManager();
        instance.displayLongestTask();
        
    }

    /**
     * Test of searchTaskByName method, of class TaskManager.
     */
    @Test
    public void testSearchTaskByName() {
        System.out.println("searchTaskByName");
        String taskName = "Create Login";
        TaskManager instance = new TaskManager();
        instance.searchTaskByName(taskName);
        
    }

    /**
     * Test of searchTasksByDeveloper method, of class TaskManager.
     */
    @Test
    public void testSearchTasksByDeveloper() {
        System.out.println("searchTasksByDeveloper");
        String developer = "Mike Smith";
        TaskManager instance = new TaskManager();
        instance.searchTasksByDeveloper(developer);
        
    }

    /**
     * Test of deleteTask method, of class TaskManager.
     */
    @Test
    public void testDeleteTask() {
        System.out.println("deleteTask");
        String taskName = "Create Login";
        TaskManager instance = new TaskManager();
        instance.deleteTask(taskName);
        
    }

    /**
     * Test of displayReport method, of class TaskManager.
     */
    @Test
    public void testDisplayReport() {
        System.out.println("displayReport");
        TaskManager instance = new TaskManager();
        instance.displayReport();
       
    }
    
}
