package kalash.jain.collection;

import java.util.Queue;
import java.util.LinkedList;

public class TestingQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(); 
        
        queue.add(1);
        queue.offer(2);

        Utility.print(queue);
        
        System.out.println(queue.element());
        System.out.println(queue.peek());
        
        System.out.println(queue.remove());
        Utility.print(queue);
        System.out.println(queue.poll());
        Utility.print(queue);
        
        System.out.println(queue.poll());
    }
}