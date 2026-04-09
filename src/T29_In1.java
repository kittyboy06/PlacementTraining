import static java.lang.System.out;
import java.util.Scanner;

class T29_In1
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int ini = 6;
        if(n>=1)
        {
            out.print(ini + " ");
        }
        for(int i = 1;i<=n-1;i++)
        {
            out.print(ini + (5*i) + " ");
            ini = ini + (5*i);
        }
    }
}