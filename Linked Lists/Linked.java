import java.util.LinkedList;

public class Linked {
    public static void main(String[] args) {
        LinkedList<Integer> link = new LinkedList<>();

        link.add(10);
        link.add(20);   
        
        System.out.println(link);
        
        
        if (link.size() > 1) {
            link.set(1, 30); 
            System.out.println("After set: " + link);
        } else {
            System.out.println("Not enough elements to use set.");
        }
        
    }
}
