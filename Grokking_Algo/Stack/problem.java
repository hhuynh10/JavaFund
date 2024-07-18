import java.util.Stack;

public class problem {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        
        System.out.println(stack.empty());

        stack.push("a1b2c3d4");
        stack.push("xYz9876");
        stack.push("QWERTYuiop");
        stack.push("StackOverflow123");
        stack.push("openAIrocks");
        System.out.println(stack);

        String last = stack.pop();
        System.out.println(last);

        System.out.println(stack.peek());

        System.out.println(stack.size());

        System.out.println(stack.search("xYz9876"));
    }
}
