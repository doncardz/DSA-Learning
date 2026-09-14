package Linear_Data_Structure;

import java.util.*;

public class priorityqueues {
    public static void main(String[] args) {

        //Priority Queue = A FIFO data structure that serves elements
        //                  with the highest priorities first
        //                  before elements with lower priority.


        //Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder()); = Highest priority first
        Queue<String> queue = new PriorityQueue<>();

        queue.offer("A");
        queue.offer("C");
        queue.offer("D");
        queue.offer("B");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
