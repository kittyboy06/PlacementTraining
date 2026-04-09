import static java.lang.System.out;
import java.util.Scanner;

public class T29_Post2
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        for(int i = 1;i<=n;i++)
        {
            if(i%2!=0)
            {
                out.print(i+1 + " ");
            }
            else
            {
                out.print(i-1 + " ");
            }
        }
    }
}