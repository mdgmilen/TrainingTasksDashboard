package com.improve1.trainings;

import java.util.ArrayList;

public class Main {
    private static ArrayList<Task> tasks = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Start<<<<<<<<<<<<<<<<<<");
        Task task1 = new Task(1, "interesting task", "for mid-level dev", TaskStatus.TODO);
        Task task2 = new Task(2, "more interesting task", "for mid-level dev", TaskStatus.TODO);
        Task task3 = new Task(3, "less interesting task", "for mid-level dev", TaskStatus.TODO);
        Task task4 = new Task(4, "interesting task", "for mid-level dev", TaskStatus.TODO);
        Task task5 = new Task(5, "interesting task", "for mid-level dev", TaskStatus.TODO);
        Task task6 = new Task(6, "task", "for senior dev", TaskStatus.TODO);
        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);
        tasks.add(task4);
        tasks.add(task5);
        tasks.add(task6);
        boolean trueExpected1 = tasks.get(0).moveForward();
        boolean trueExpected2 = tasks.get(1).moveForward();
        boolean trueExpected3 = tasks.get(2).moveForward();
        boolean falseExpected = tasks.get(3).moveForward();
        boolean falseExpected2 = tasks.get(3).moveForward();
        System.out.println(trueExpected1);
        System.out.println(trueExpected2);
        System.out.println(trueExpected3);
        System.out.println(falseExpected);
        System.out.println(falseExpected2);


        System.out.println("End>>>>>>>>>>>>>>>>>>>>>");
    }

    public static int getInProgressTasksCount() {
//        int count = 0;
//        for (int i = 0; i < tasks.size(); i++) {
//            if (tasks.get(i).getTStatus() == TaskStatus.IN_PROGRESS) {
//                count++;
//            }
//        }
        int count = (int) tasks.stream()
                .filter(task -> task.getTStatus() == TaskStatus.IN_PROGRESS)
                .count();
        return count;
    }

// Ich soll es den Interviewern sagen:
//   Ich habe Deutschkenntnisse und möchte diese gerne verbessern!
//   Ich habe über 15 Jahre Erfahrung in der FinTech-Branche.
//   Ich verwende normalerweise Ubuntu Linux.

    /*Implement a simple Kanban board. A Kanban board has various tasks with ID, name,
     description, and status. Tasks can be moved from the
     TODO status to IN PROGRESS and from IN PROGRESS to DONE.
      There should never be more than 3 tasks in IN PROGRESS.
     */





}