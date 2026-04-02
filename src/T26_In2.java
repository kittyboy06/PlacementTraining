import static java.lang.System.out;
import java.util.*;

public class T26_In2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int sum = 0;
        for (int i = n - 1; i >= n - k; i--) {
            sum += arr[i];
        }
        out.print(sum);
    }
}