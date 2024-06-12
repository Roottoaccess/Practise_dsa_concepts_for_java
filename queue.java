import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Comparator;
import java.lang.Thread;
public class queue extends Thread{
    public static void main(String[] args) {
        
        /* Creating the queue */
        Queue <Integer> queue = new LinkedList<>();

        queue.offer(20);
        queue.offer(12);
        queue.offer(8);
        queue.offer(8);
        queue.offer(48);

        /* Iterating to the queue */
        System.out.println();
        // try{
        //     for(int i: queue){
        //         System.out.print(i+" ");
        //         Thread.sleep(500);
        //     }
        // }catch(Exception e){
        //     System.out.println(e);
        // }

        System.out.println(queue);

        System.out.println();
        System.out.println("The peek value is: "+queue.peek());

        System.out.println();

        queue.poll();
        System.out.println("After applying the remove function in queue: "+queue);

        /* Creating the funtion and calling the function */
        Engine();
    }

    public static void Engine(){
        PriorityQueue <Integer> que = new PriorityQueue<>(Comparator.naturalOrder());

        que.offer(42);
        que.offer(24);
        que.offer(15);
        que.offer(84);
        que.offer(44);
        que.offer(12);
        que.offer(62);
        que.offer(82);

        System.out.println();
        System.out.println("Priority queue: "+que);

        /* So its not necessary that the data in Comparator natural order will be in asending order but only the first value to poll will be the smallest */
        que.poll();
        System.out.println(que);

        // Similarly the decending order would be (Comparator.reverseOrder());
    }
}
