import java.util.ArrayDeque;
import java.lang.Thread;
import java.sql.Array;
public class Array_Dequeue extends Thread{
    public static void main(String[] args) {
        ArrayDeque <Integer> deque = new ArrayDeque<>();
        
        deque.offer(32);

        /* We can offer it in the fast place also */
        deque.offerFirst(12);

        /* We can offer it in the last place also */
        deque.offerLast(42);

        deque.offer(14);

        /* Displaying the Dequeue */
        System.out.println(deque);


        System.out.println("Pick the last element: "+deque.peekLast());

        /* Similarly we can perform poll last and poll first in this case */
        deque.pollLast();

        System.out.println("Poll last: "+deque);

        deque.pollFirst();

        System.out.println("Poll first: "+deque);
    }
}
