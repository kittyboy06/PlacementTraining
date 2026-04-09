import static java.lang.System.out;
import java.util.Scanner;

public class T30_Post2
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        for (int i = 1; i <= n; i++)
        {

            for (int s = 1; s < i; s++)
            {
                out.print("  ");
            }

            for (int j = i; j <= n; j++)
            {
                out.print("* ");
            }

            out.print("\n");
        }
    }
}