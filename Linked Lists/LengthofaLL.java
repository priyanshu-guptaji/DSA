class Node{
    int data ;
    Node next;

    Node(int data1){
        data = data1;
        next = null;
    }
}

class Solution{
    public int lengthOfLinkedList(Node head){
        int count = 0;

        Node temp = head;

        while(temp != null){
            count ++;

            temp =temp.next;
        }

        return count;
    }
}
public class LengthofaLL {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        Solution obj = new Solution();

        System.out.println("Length of the Linked List: " +obj.lengthOfLinkedList(head));
    }
}
