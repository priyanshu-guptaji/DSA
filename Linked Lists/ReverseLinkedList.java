public class ReverseLinkedList {

    // Node definition
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to reverse linked list
    static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next; // save next
            curr.next = prev;     // reverse link
            prev = curr;          // move prev
            curr = next;          // move curr
        }
        return prev; // new head
    }

    // Function to print linked list
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        // Create linked list: 10 -> 20 -> 30 -> null
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        System.out.println("Original Linked List:");
        printList(head);

        // Reverse linked list
        head = reverse(head);

        System.out.println("Reversed Linked List:");
        printList(head);
    }
}
