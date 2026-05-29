import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), arr[] = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int key = sc.nextInt(), l = 0, r = n - 1;

        while(l <= r) {

            int m = (l + r) / 2;

            if(arr[m] == key) {
                System.out.println("Found");
                return;
            }

            if(arr[m] < key)
                l = m + 1;
            else
                r = m - 1;
        }

        System.out.println("Not Found");
    }
}