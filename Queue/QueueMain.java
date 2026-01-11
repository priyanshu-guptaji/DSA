public class QueueMain {

    static class Queue {
        int[] arr;
        int front, rear, size, capacity;

        Queue(int capacity) {
            this.capacity = capacity;
            arr = new int[capacity];
            front = 0;
            rear = -1;
            size = 0;
        }

        // Enqueue
        void enqueue(int x) {
            if (size == capacity) {
                System.out.println("Queue Overflow");
                return;
            }
            rear = (rear + 1) % capacity;
            arr[rear] = x;
            size++;
        }

        // Dequeue
        int dequeue() {
            if (size == 0) {
                System.out.println("Queue Underflow");
                return -1;
            }
            int val = arr[front];
            front = (front + 1) % capacity;
            size--;
            return val;
        }

        // Peek
        int peek() {
            if (size == 0) return -1;
            return arr[front];
        }

        boolean isEmpty() {
            return size == 0;
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.dequeue()); // 10
        System.out.println(queue.peek());    // 20
    }
}
