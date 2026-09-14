package Linear_Data_Structure;

import java.util.Queue;
import java.util.LinkedList;

public class queues {
    public static void main(String[] args) {

        // Queues = FIFO, First-In First-Out
        /*
            add = enqueue, offer()
            remove = dequeue, poll()
        */
        
        Queue<String> queue = new LinkedList<String>();

        queue.offer("Sharen");
        queue.offer("Carlo");
        queue.offer("JC");
        queue.offer("Don");
        queue.offer("John");

        //System.out.println(queue.isEmpty());
        //System.out.println(queue.size());
        System.out.println(queue.contains("John"));

        //System.out.println(queue.peek());

        //queue.poll();
        //queue.poll();
        //queue.poll();
        //queue.poll();


        //System.out.println(queue);
    }
}