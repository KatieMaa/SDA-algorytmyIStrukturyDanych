package test.algorytmy.structures.queue;

import algorytmy.structures.queue.LIFOQueue;
import algorytmy.structures.queue.Queue;

/**
 * Created by RENT on 2017-02-20.
 */
public class LIFOQueueTests {
    public static void main(String[] args) {
        Queue queue = new LIFOQueue();
        queue.pop();
        System.out.println();

        queue.push(3);
        queue.push(4);
        queue.push(2);
        queue.push(-3);
        System.out.println(queue);

        Queue clonedQueue = queue.clone();
        System.out.println(clonedQueue);

        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue);
    }
}
