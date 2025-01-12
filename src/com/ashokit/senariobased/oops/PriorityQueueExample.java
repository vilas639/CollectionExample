package com.ashokit.senariobased.oops;


import java.util.PriorityQueue;

/*
 How would you implement a priority queue system where tasks have different priorities?
Answer:

Use PriorityQueue with a custom comparator:

 */
public class PriorityQueueExample {

    public static void main(String[] args) {

        PriorityQueue<Task> queue = new PriorityQueue<>();

        queue.add(new Task("Low priority", 1));
        queue.add(new Task("High priority", 3));
        queue.add(new Task("Medium priority", 2));

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }

}


 class Task implements Comparable<Task> {
    private String name;
    private int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public int compareTo(Task other) {
        return Integer.compare(other.priority, this.priority); // Higher priority first
    }

    @Override
    public String toString() {
        return "Task{name='" + name + "', priority=" + priority + '}';
    }
}