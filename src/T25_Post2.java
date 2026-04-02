import static java.lang.System.out;
import java.util.Scanner;

public class T25_Post2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int original = n;

        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum +=digit * digit * digit;
            n = n / 10;
        }

        out.print((sum == original) ? "Access Granted" : "Access Denied");
    }
}