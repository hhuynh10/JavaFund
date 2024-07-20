import java.util.LinkedList;

public class Problem {
    public static void main(String[] args) {
        LinkedList<String> linkedList1 = new LinkedList<String>();
        LinkedList<String> linkedList2 = new LinkedList<String>();

        // Stack
        linkedList1.push("A");
        linkedList1.push("B");
        linkedList1.push("C");
        linkedList1.push("D");
        linkedList1.push("E");
        System.out.println(linkedList1);

        String pop = linkedList1.pop();
        System.out.println(pop);

        // Queue
        linkedList2.offer("A");
        linkedList2.offer("B");
        linkedList2.offer("C");
        linkedList2.offer("D");
        linkedList2.offer("E");
        System.out.println(linkedList2);

        String poll = linkedList2.poll();
        System.out.println(poll);

        linkedList2.add(4, "G");
        System.out.println(linkedList2);

        linkedList2.remove("G");
        System.out.println(linkedList2);

        linkedList2.addFirst("A");
        linkedList2.addLast("G");
        System.out.println(linkedList2);

        String first = linkedList2.removeFirst();
        String last = linkedList2.removeLast();
        System.out.println(first + " " + last);
    }
}
