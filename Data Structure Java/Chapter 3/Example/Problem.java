public class Problem {
    public static void main(String[] args) {
        Node start = new Node(22);
        Node p = start;
        for (int i = 1; i < 4; i++){
            p = p.next = new Node(22 + 11*i);
        }
        for (p = start; p != null; p = p.next){
            System.out.println(p.data);
        }
        System.out.println();
        start = insert(start, 45);
        for (p = start; p != null; p = p.next){
            System.out.println(p.data);
        }
        System.out.println();
        start = delete(start, 55);
        for (p = start; p != null; p = p.next){
            System.out.println(p.data);
        }
    }

    public static Node insert(Node start, int x){
        if (start == null || start.data > x){
            start = new Node(x, start);
            return start;
        }
        Node p = start;
        while (p.next != null){
            if (p.next.data > x) break;
            p = p.next;
        }
        p.next = new Node(x, p.next);
        return start;
    }

    public static Node delete(Node start, int x){
        if (start == null || start.data > x){
            return start;
        } else if (start.data == x){
            return start.next;
        }

        for (Node p = start; p.next != null; p = p.next){
            if (p.next.data > x){
                break;
            } else if (p.next.data == x){
                p.next = p.next.next;
                break;
            }
        }
        return start;
    }
}

class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
    Node (int data, Node next){
        this.data = data;
        this.next = next;
    }
}
