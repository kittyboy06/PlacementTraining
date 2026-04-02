import static java.lang.System.out;
import java.util.Scanner;

public class T26_Post2
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        if (!inp.hasNextInt())
        {
            out.print("Wrong Input");
            return;
        }
        int n = inp.nextInt();
        if (n < 0 || n > 100000)
        {
            out.print("Wrong Input");
            return;
        }
        int count = 0;
        while (n > 0)
        {
            if (n % 2 == 1)
            {
                count++;
            }
            n = n / 2;
        }
        out.print(count);
    }
}