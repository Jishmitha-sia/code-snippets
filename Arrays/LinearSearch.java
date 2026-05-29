import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), arr[] = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int key = sc.nextInt();

        for(int num : arr) {
            if(num == key) {
                System.out.println("Found");
                return;
            }
        }

        System.out.println("Not Found");
    }
}