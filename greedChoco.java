import java.util.*;

public class greedChoco {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of children: ");
        int n = sc.nextInt();

        int[] greed = new int[n];

        System.out.println("Enter greed values:");
        for (int i = 0; i < n; i++) {
            greed[i] = sc.nextInt();
        }

        
        System.out.print("Enter number of chocolates: ");
        int m = sc.nextInt();

        int[] choco = new int[m];

        System.out.println("Enter chocolate sizes:");
        for (int i = 0; i < m; i++) {
            choco[i] = sc.nextInt();
        }

        Arrays.sort(greed);
        Arrays.sort(choco);

        int i = 0; 
        int j = 0; 
        int count = 0;

        
        while (i < n && j < m) {

            if (choco[j] >= greed[i]) {
                count++;
                i++;
                j++;
            } else {
                j++;
            }
        }

        System.out.println("Maximum satisfied children: " + count);

        sc.close();
    }
}