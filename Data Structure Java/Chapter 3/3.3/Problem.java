public class Problem {
    public static void main(String[] args) {
        Node start = new Node(10);
        Node p = start;
        for (int i = 1; i < 5; i++){
            p = p.next = new Node(10 + 10*i);
        }
        
        for (p = start; p != null; p = p.next){
            System.out.print(p.data + " ");
            }
        System.out.println(sum(start));
    }

    public static int sum(Node list){
        int sum = 0;
        while (list != null){
            sum += list.data;
            list = list.next;
        }
        return sum;
    }
}

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
