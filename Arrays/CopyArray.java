import java.util.*;

public class CopyArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n], b[] = new int[n];

        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        for(int i = 0; i < n; i++)
            b[i] = a[i];

        System.out.println(Arrays.toString(b));
    }
}