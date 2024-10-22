import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        
        // Last In First Out (LIFO) principle
        
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack after push operations: " + stack);

        // Peek the top element
        int topElement = stack.peek();
        System.out.println("Top element (peek): " + topElement);

        // Pop an element from the stack
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        System.out.println("Stack after pop operation: " + stack);

        // Check if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is stack empty? " + isEmpty);

        // Pop all elements from the stack
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }

        // Check again if the stack is empty
        System.out.println("Stack after popping all elements: " + stack);
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
