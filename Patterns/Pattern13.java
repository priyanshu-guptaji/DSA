import java.util.*;
public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print pattern:");
        int n = sc.nextInt();

        for(int i = 1 ; i <=n ; i++){
            System.out.print(i);
            for(int j =1 ; j<=n ; j++){
                System.out.print(j);
                
            }
        }
    }
}
