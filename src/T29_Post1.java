import static java.lang.System.out;
import java.util.Scanner;

public class T29_Post1
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        int a = 1, b = 3, c = 4;

        if (n >= 1) out.print(a + " ");
        if (n >= 2) out.print(b + " ");
        if (n >= 3) out.print(c + " ");

        for (int i = 4; i <= n; i++)
        {
            int next = a + b + c;
            out.print(next + " ");

            a = b;
            b = c;
            c = next;
        }
    }
}