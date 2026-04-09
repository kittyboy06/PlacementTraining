import static java.lang.System.out;
import java.util.Scanner;

public class T30_In3
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        for (int i = 1; i <= n; i++)
        {
            for (int k = 1; k <= n - i; k++)
            {
                out.print("  ");
            }

            for (int j = 1; j <= 2 * i - 1; j++)
            {
                out.print("* ");
            }

            out.println();
        }
    }
}