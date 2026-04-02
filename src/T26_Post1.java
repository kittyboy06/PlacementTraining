import static java.lang.System.out;
import java.util.Scanner;

class T26_Post1
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int largest = -1;
        for (int i = 2; i <= n; i++)
        {
            while (n % i == 0)
            {
                largest = i;
                n = n / i;
            }
        }
        if (largest == n)
        {
            out.print(-1);
        }
        else
        {
            out.print(largest);
        }
    }
}