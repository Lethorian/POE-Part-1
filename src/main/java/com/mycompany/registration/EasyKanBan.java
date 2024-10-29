/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registration;
 import javax.swing.*;
import java.util.ArrayList;
/**
 *
 * @author RC_Student_lab
 */

   

public class EasyKanBan {
    private static final ArrayList<Task> tasks = new ArrayList<>();
    private static int taskCounter = 0;

    public static void main(String[] args) {
        // Simulate user login (implement your actual login logic)
        if (loginUser()) {
            JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
            manageTasks();
        }
    }

    private static boolean loginUser() {
        // Replace this with your actual login logic
        String username = JOptionPane.showInputDialog("Enter Username:");
        String password = JOptionPane.showInputDialog("Enter Password:");
        // Assume successful login for now
        return true;
    }

    private static void manageTasks() {
        int numberOfTasks = Integer.parseInt(JOptionPane.showInputDialog("How many tasks do you want to enter?"));

        while (taskCounter < numberOfTasks) {
            String taskName = JOptionPane.showInputDialog("Enter Task Name:");
            String taskDescription = JOptionPane.showInputDialog("Enter Task Description (max 50 characters):");
            
            if (taskDescription.length() > 50) {
                JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters");
                continue; // Skip to the next iteration
            }
            
            String developerName = JOptionPane.showInputDialog("Enter Developer's Full Name:");
            double taskDuration = Double.parseDouble(JOptionPane.showInputDialog("Enter Estimated Duration (in hours):"));

            // Create Task and add it to the list
            Task task = new Task(taskName, taskDescription, developerName, (int) taskDuration, taskCounter);
            tasks.add(task);
            taskCounter++;

            // Display task details
            JOptionPane.showMessageDialog(null, task.getDetails());
        }

        // Calculate total hours
        double totalHours = tasks.stream().mapToDouble(Task::getDuration).sum();
        JOptionPane.showMessageDialog(null, "Total Hours: " + totalHours);
    }
}


