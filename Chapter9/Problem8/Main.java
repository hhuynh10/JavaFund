package Chapter9.Problem8;

public class Main {
    public static void main(String[] args) {
        Fan input1 = new Fan(Fan.FAST, true, 10, "yellow");
        Fan input2 = new Fan(Fan.MEDIUM, false, 5, "blue");

        input1.print();
        input2.print();
    }
}
