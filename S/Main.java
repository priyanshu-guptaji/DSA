public class Main {

    static class Stack {
        int[] arr;
        int top;
        int capacity;

        // Constructor
        Stack(int size) {
            arr = new int[size];
            capacity = size;
            top = -1;
        }

        // Push
        void push(int x) {
            if (top == capacity - 1) {
                System.out.println("Stack Overflow");
                return;
            }
            arr[++top] = x;
        }

        // Pop
        int pop() {
            if (top == -1) {
                System.out.println("Stack Underflow");
                return -1;
            }
            return arr[top--];
        }

        // Peek
        int peek() {
            if (top == -1) return -1;
            return arr[top];
        }

        // Is Empty
        boolean isEmpty() {
            return top == -1;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop());   // 30
        System.out.println(stack.peek());  // 20
    }
}
