import static java.lang.System.out;
import java.util.Scanner;

class T30_In1
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        for(int i = 1;i<=n;i++)
        {
            for(int j = 1;j<=i;j++)
            {
                out.print("* ");
            }
            out.print("\n");
        }
    }
}