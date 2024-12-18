// Queue Ex
import java.util.*;
public class Countdown {
    public static void main(String[] args) throws InterruptedException {
        int time = Integer.parseInt(args[0]);
        Queue<Integer> queue = new LinkedList<Integer>();  //FIFO
        for (int i = time; i >= 0; i--) queue.add(i);   
        // offer(i)
        for (int i = time; i >= 0; i--) System.out.println(queue.element());
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());       //poll()
            Thread.sleep(1000);
        }
    }
}
