class Node{
    int data;
    Node next;

    Node(int val){
        data = val;
        next = null;
    }
}

class Solution{
    public boolean searchValue(Node head , int key){
        Node currentNode = head ;
        
        while(currentNode != null){
            if (currentNode.data == key){
                return true;
            }

            currentNode = currentNode.next;
        }

        return false;
    }
}
public class SearchLL {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node( 40);
        head.next.next.next.next = new Node(50);

        Solution obj = new Solution();

        if(obj.searchValue(head, 20)){
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }
    }
}
