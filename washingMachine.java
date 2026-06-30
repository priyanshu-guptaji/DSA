import java.util.*;

class WashingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n > 7000) {
            System.out.println("Overloaded");
        } else if (n >= 0 && n <= 2000) {
            System.out.println("25 min");
        } else if (n <= 4000) {
            System.out.println("35 min");
        } else {
            System.out.println("45 min");
        }

        sc.close();
    }
}