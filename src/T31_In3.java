import static java.lang.System.out;
import java.util.Scanner;

public class T31_In3
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                if (i == 1 || i == n || j == 1 || j == n)
                {
                    out.print("* ");
                }
                else
                {
                    out.print("  ");
                }
            }
            out.println();
        }
    }
}