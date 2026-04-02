import static java.lang.System.out;
import java.util.Scanner;

public class T26_In3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1)
        {
            out.print(0);
            return;
        }
        if (n == 2)
        {
            out.print(1);
            return;
        }
        if (n == 3)
        {
            out.print(2);
            return;
        }
        int result = 1;
        while (n > 4)
        {
            result = result * 3;
            n = n - 3;
        }
        result = result * n;
        out.print(result);
    }
}
