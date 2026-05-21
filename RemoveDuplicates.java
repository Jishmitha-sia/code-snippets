import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        Set<Integer> set = new LinkedHashSet<>();

        for(int num : arr)
            set.add(num);

        System.out.println(set);

        sc.close();
    }
}