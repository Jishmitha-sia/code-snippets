import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        for(int n = start; n <= end; n++) {

            boolean prime = n > 1;

            for(int i = 2; i < n; i++) {
                if(n % i == 0) {
                    prime = false;
                    break;
                }
            }

            if(prime)
                System.out.print(n + " ");
        }

        sc.close();
    }
}