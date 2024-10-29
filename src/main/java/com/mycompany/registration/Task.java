/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registration;

/**
 *
 * @author RC_Student_lab
 */
public class Task {

    static double getDuration(Task value) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private final String taskName;
    private final String taskDescription;
    private final String developerName;
    private final int taskDuration;
    private final int taskNumber;
    private static int totalHours = 0;

    // Constructor to initialize Task attributes and add to total hours
    public Task(String taskName, String taskDescription, String developerName, int taskDuration, int taskNumber) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.developerName = developerName;
        this.taskDuration = taskDuration;
        this.taskNumber = taskNumber;
        totalHours += taskDuration;  // Add duration to total hours for all tasks
    }

    // Method to check if task description is valid (not more than 50 characters)
    public boolean checkTaskDescription() {
        return taskDescription.length() <= 50;
    }

    // Method to create a unique Task ID
    public String createTaskID() {
        String taskID = taskName.substring(0, 2).toUpperCase() + ":" + taskNumber + ":" 
                        + developerName.substring(developerName.length() - 3).toUpperCase();
        return taskID;
    }

    // Method to return full task details
    public String printTaskDetails() {
        return """
               Task Status: To Do
               Developer Details: """ + developerName + "\n" +
               "Task Number: " + taskNumber + "\n" +
               "Task Name: " + taskName + "\n" +
               "Task Description: " + taskDescription + "\n" +
               "Task ID: " + createTaskID() + "\n" +
               "Duration: " + taskDuration + " hours";
    }

    // Static method to return total combined hours of all tasks
    public static int returnTotalHours() {
        return totalHours;
    }

    Object getDetails() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


