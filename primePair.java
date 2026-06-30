import java.util.ArrayList;
import java.util.Scanner;

public class primePair {
    static boolean isPrime(int n) {
        if (n < 2)
            return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first range: ");
        int n1 = sc.nextInt();

        System.out.print("Enter last range: ");
        int n2 = sc.nextInt();

        ArrayList<Integer> primes = new ArrayList<>();

        for (int i = n1; i <= n2; i++) {
            if (isPrime(i))
                primes.add(i);
        }

        int diff = 4; // required difference
        int count = 0;

        for (int i = 0; i < primes.size() - 1; i++) {
            if (primes.get(i + 1) - primes.get(i) == diff) {
                System.out.println("(" + primes.get(i) + ", " + primes.get(i + 1) + ")");
                count++;
            }
        }

        System.out.println("Total pairs = " + count);
    }
}