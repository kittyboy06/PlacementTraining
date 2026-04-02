import static java.lang.System.out;
import java.util.Scanner;

class T25_In2
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int t = 0;
        for(int i = 1;i<=n;i++)
        {
            if(n%i==0)
            {
                t+=i;
            }
        }
        out.print(t);
    }
}