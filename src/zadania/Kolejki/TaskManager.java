package zadania.Kolejki;

import java.util.PriorityQueue;
import java.util.Scanner;

public class TaskManager {
    PriorityQueue<Task> toDoList;
    public TaskManager(){
        toDoList = new PriorityQueue<>();
    }

    public static void main(String[] args) {
        TaskManager tasker = new TaskManager();
        Scanner sc = new Scanner(System.in);
        int action;
        do {
            System.out.println("What you want to do:");
            System.out.println("1 - add new task \n" +
                    "2 - take a task \n" +
                    "3 - exit");
            Task nextTask;
            action = sc.nextInt();
            sc.nextLine();
            switch (action){
                case 1:
                    tasker.addNewTask(sc);
                    break;
                case 2:

                    nextTask = tasker.getNextTask();
                    System.out.println("Next task: " + nextTask);
                    break;
                case 3:
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("No such action");

            }

        } while (action != 3);
    }

    private Task getNextTask() {
        return this.toDoList.poll();

    }

    private void addNewTask(Scanner scanner) {
        System.out.println("Adding a new Task");
        System.out.println("Task Name:");
        String taskName = scanner.nextLine();
        System.out.println("Short description:");
        String description = scanner.nextLine();
        System.out.println("Task priority: from 1 - Low, to 3 - High:");
        int intPriority = scanner.nextInt();
        TaskPriority priority = TaskPriority.values()[intPriority];
        scanner.nextLine();
        toDoList.offer(new Task(taskName,description,priority));
    }
}
