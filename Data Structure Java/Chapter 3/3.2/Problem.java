public class Problem {
    public static void main(String[] args) {
        Node start = new Node(33);
        Node p = start;
        for (int i = 1; i < 5; i++) {
            p = p.next = new Node(33 + 11 * i);
        }
        for (p = start; p != null; p = p.next) {
            System.out.println(p.data);
        }

        System.out.println(size(start)); // Pass 'start' instead of 'p' to size method
    }

    public static int size(Node list) {
        int count = 0;
        while (list != null) {
            count++;
            list = list.next;
        }
        return count;
    }
}

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
}
