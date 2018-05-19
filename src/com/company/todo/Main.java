package com.company.todo;

import com.company.todo.iterator.TodoIterable;
import com.company.todo.model.ToDo;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

    private static TodoIterable todoManager = new TodoIterable();
    /**
     * Menu
     * 1. See active tasks (isDone = false)
     * 1.1. Complete task
     * 2. Add new task
     * 2.1. Add description
     */
    public static void main(String[] args) {
//        ToDo firstTask = new ToDo("Clean up the house");
//        ToDo secondTask = new ToDo("Do Tel-Ran homework");

//
//        TodoIterable iterable = new TodoIterable();
//        iterable.add(firstTask);
//        iterable.add(secondTask);
//
//        Iterator<ToDo> iterator = iterable.iterator();
//
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next().toString());
//        }

        Integer menuOption = menu();
        while (!menuOption.equals(3)) {

            if (menuOption.equals(1)) {
                seeActiveTasks();
            } else if (menuOption.equals(2)) {
                addNewTask();
            }

            menuOption = menu();
        }

    }

    public static Integer menu() {
        System.out.println("1. See active tasks");
        System.out.println("2. Add new task");
        System.out.println("3. Exit");

        return new Scanner(System.in).nextInt();
    }

    public static void seeActiveTasks() {
        Iterator<ToDo> iterator = todoManager.iterator();
        while (iterator.hasNext()) {
            ToDo next = iterator.next();
            System.out.println(next.toString());
            System.out.println("1. Complete task\t2. Delete task\t3.Next task");
            Integer option = new Scanner(System.in).nextInt();
            if (option.equals(1)) {
                next.setDone(true);

            } else if (option.equals(2)) {

                iterator.remove();
            } else if (option.equals(3)) {
                continue;
            }
        }

        System.out.println("You have no more tasks TODO");
        System.out.println();
        System.out.println();
        System.out.println("----------------------------");

    }

    public static void addNewTask() {
        System.out.println("Enter task description");
        String description = new Scanner(System.in).nextLine();

        ToDo toDo = new ToDo(description);
        todoManager.add(toDo);
        System.out.println();
        System.out.println();
        System.out.println("----------------------------");
    }

}
