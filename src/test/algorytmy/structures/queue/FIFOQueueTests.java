package test.algorytmy.structures.queue;

import algorytmy.structures.queue.FIFOQueue;
import algorytmy.structures.queue.Queue;
import algorytmy.structures.queue.QueueException;

/**
 * Created by RENT on 2017-02-18.
 */
public class FIFOQueueTests {
    public static void main(String[] args) throws QueueException {
        Queue queue = new FIFOQueue();
        queue.push(9);
        queue.push(4);
        queue.push(7);
        queue.push(1);
        System.out.println(queue);
        System.out.println(queue);

        Queue clonedQueue = queue.clone();
        System.out.println(clonedQueue);
        clonedQueue.pop();
        System.out.println(queue);
        System.out.println(clonedQueue);

        queue.pop();
        System.out.println(queue);
        queue.pop();
        queue.push(8);
        System.out.println(queue);
        queue.pop();
        System.out.println(queue);
        queue.pop();
        System.out.println(queue);
    }
}
