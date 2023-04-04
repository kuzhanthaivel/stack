import java.util.LinkedList;

public class Stack {
    private LinkedList<Integer> list = new LinkedList<>();

    public void push(int item) {
        list.addFirst(item);
    }

    public int pop() {
        if (list.isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return list.removeFirst();
    }

    public int peek() {
        if (list.isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return list.getFirst();
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop()); // Output: 30
        System.out.println(stack.peek()); // Output: 20
        stack.push(40);
        System.out.println(stack.peek()); // Output: 40
    }
}
