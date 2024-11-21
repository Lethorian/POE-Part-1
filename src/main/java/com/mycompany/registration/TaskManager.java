package com.mycompany.registration;


import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_lab
 */
public class TaskManager {
private final ArrayList<String> developerArray = new ArrayList<>();
private final ArrayList<String> taskNamesArray = new ArrayList<>();
private final ArrayList<String> taskIDsArray = new ArrayList<>();
private final ArrayList<Integer> taskDurationsArray = new ArrayList<>();
private final ArrayList<String> taskStatusesArray = new ArrayList<>();


 public void addTask(String developer, String taskName, String taskID, int duration, String status) {
    developerArray.add(developer);
    taskNamesArray.add(taskName);
    taskIDsArray.add(taskID);
    taskDurationsArray.add(duration);
    taskStatusesArray.add(status);
}

public void displayTasksByStatus(String status) {
    for (int i = 0; i < taskStatusesArray.size(); i++) {
        if (taskStatusesArray.get(i).equalsIgnoreCase(status)) {
            System.out.println("Developer: " + developerArray.get(i) +
                               ", Task Name: " + taskNamesArray.get(i) +
                               ", Duration: " + taskDurationsArray.get(i));
        }
    }
}

public void displayLongestTask() {
    int maxDurationIndex = 0;
    for (int i = 1; i < taskDurationsArray.size(); i++) {
        if (taskDurationsArray.get(i) > taskDurationsArray.get(maxDurationIndex)) {
            maxDurationIndex = i;
        }
    }
    System.out.println("Developer: " + developerArray.get(maxDurationIndex) +
                       ", Duration: " + taskDurationsArray.get(maxDurationIndex));
}

public void searchTaskByName(String taskName) {
    for (int i = 0; i < taskNamesArray.size(); i++) {
        if (taskNamesArray.get(i).equalsIgnoreCase(taskName)) {
            System.out.println("Task Name: " + taskNamesArray.get(i) +
                               ", Developer: " + developerArray.get(i) +
                               ", Status: " + taskStatusesArray.get(i));
            return;
        }
    }
    System.out.println("Task not found.");
}

public void searchTasksByDeveloper(String developer) {
    for (int i = 0; i < developerArray.size(); i++) {
        if (developerArray.get(i).equalsIgnoreCase(developer)) {
            System.out.println("Task Name: " + taskNamesArray.get(i) +
                               ", Status: " + taskStatusesArray.get(i));
        }
    }
}

public void deleteTask(String taskName) {
    for (int i = 0; i < taskNamesArray.size(); i++) {
        if (taskNamesArray.get(i).equalsIgnoreCase(taskName)) {
            taskNamesArray.remove(i);
            developerArray.remove(i);
            taskIDsArray.remove(i);
            taskDurationsArray.remove(i);
            taskStatusesArray.remove(i);
            System.out.println("Task '" + taskName + "' successfully deleted.");
            return;
        }
    }
    System.out.println("Task not found.");
}

public void displayReport() {
    for (int i = 0; i < taskNamesArray.size(); i++) {
        System.out.println("Developer: " + developerArray.get(i) +
                           ", Task Name: " + taskNamesArray.get(i) +
                           ", Task ID: " + taskIDsArray.get(i) +
                           ", Duration: " + taskDurationsArray.get(i) +
                           ", Status: " + taskStatusesArray.get(i));
    }
}


}
