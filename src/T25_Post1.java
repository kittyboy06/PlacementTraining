import java.util.Scanner;

public class T25_Post1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        if (n <= 1) {
            System.out.print(0);
        } else {
            for (int i = 2; i <= n; i++) {
                boolean isPrime = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    sum += i;
                }
            }

            System.out.print(sum);
        }
    }
}
