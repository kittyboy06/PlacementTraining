import static java.lang.System.out;
import java.util.Scanner;

public class T31_In1
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        for (int i = 1; i <= n; i++)
        {
            for (int s = 1; s <= n - i; s++)
            {
                out.print("  ");
            }

            for (int j = 1; j <= 2 * i - 1; j++)
            {
                out.print("* ");
            }

            out.println();
        }

        for (int i = n - 1; i >= 1; i--)
        {
            for (int s = 1; s <= n - i; s++)
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