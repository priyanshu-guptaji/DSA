public class LinkedList {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        //insertion in the first
        Node newNode = new Node(5);
        newNode.next = head;
        head = newNode;

        
        
        Node temp = head ;
        while (temp != null){

            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
