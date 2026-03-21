class Node{
    int data;
    Node next;

    Node(int data1){
        data = data1;
        next = null;
    }
}

class Solution{
    public Node deleteTail(Node head){
        if (head == null || head.next == null){
            return null;
        }

        Node currentNode = head;
        while (currentNode.next.next != null){
            currentNode = currentNode.next;
        }

        currentNode.next = null;

        return head;
    }
}
public class DeleteLastNode {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        Solution obj = new Solution();
        head = obj.deleteTail(head);

        Node temp = head;
        while(temp !=  null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }
}
