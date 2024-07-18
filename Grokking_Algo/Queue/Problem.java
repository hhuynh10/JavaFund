import java.util.LinkedList;
import java.util.Queue;

public class Problem {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();

        System.out.println(queue.isEmpty());

        queue.offer("Karen");
        queue.offer("Steve");
        queue.offer("Chad");
        queue.offer("Harold");
        System.out.println(queue);
        
        String first = queue.poll();
        System.out.println(first);
        
        System.out.println(queue.peek());

        System.out.println(queue.size());

        System.out.println(queue.contains("Steve"));
    }
}
