
class Node{
    int data;
    Node next;
    Node prev;

    Node(int data1 , Node next1 , Node prev1){
        data = data1;
        next = next1;
        prev = prev1;
    }

    Node(int data1){
        data = data1;
        next = null;
        prev = null;
    }
}

class Solution{
    //Function to convert an array to doubly Linked list
    public static Node convertArr2DLL(int[] arr){
    //create the head node with the first element of the array
    Node head = new Node(arr[0]);
    Node prev = head; //Intialize 'prev' to the head node

    //Taverse the array to create the doubly linked list
    for (int i = 1 ; i<arr.length ; i++){
        Node temp = new Node(arr[i], null, prev);  // Create a new node
            prev.next = temp;  // Set 'next' of the previous node to the new node
            prev = temp;  // Move 'prev' to the new node
        }

        return head;  // Return the head of the doubly linked list
    }

    // Function to print the elements of the doubly linked list
    public static void print(Node head) {
        // Traverse through the list and print each node's data
        while (head != null) {
            System.out.print(head.data + " ");  // Print the data of the current node
            head = head.next;  // Move to the next node
        }
        System.out.println();  // New line after printing the list
    }

    // Function to insert a new node at the tail of the doubly linked list
   public static Node insertAtTail(Node head, int k) {
    Node newNode = new Node(k);

    if (head == null) {
        return newNode;
    }

    Node tail = head;
    while (tail.next != null) {
        tail = tail.next;
    }

    tail.next = newNode;
    newNode.prev = tail;   // FIXED

    return head;
}
}
public class InsertatFirst {
    public static void main(String[] args) {
        // Intialize an array of Integers
        int [] arr = {12 , 5 ,8,7,4};

        //convert the array to a doubly Linked list
        Node head = Solution.convertArr2DLL(arr);

        //Print the initially created doubly linked list
        System.out.println("Doubly Linked List Initially: ");
        Solution.print(head);

        //Insert a node with value 10 at the end of the doubly Linked List
        System.out.println("\n Doubly Linked List After inserting at the tail with value 10:");
        head = Solution.insertAtTail(head , 10);
        Solution.print(head);
        

    }
}
