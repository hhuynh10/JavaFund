import java.util.PriorityQueue;
import java.util.Queue;

public class Problem {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<String>();

        queue.offer("C");
        queue.offer("B");
        queue.offer("A");
        queue.offer("E");
        queue.offer("D");

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
