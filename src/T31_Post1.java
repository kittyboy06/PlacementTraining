import static java.lang.System.out;
import java.util.Scanner;

public class T31_Post1
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        int num = 1;

        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                out.print(num);
                num++;
            }
            out.println();
        }
    }
}