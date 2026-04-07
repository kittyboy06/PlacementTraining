import static java.lang.System.out;
import java.util.Scanner;

class T28_Post1
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int ini = 4;
        if(n>=1)
        {
            out.print(ini + " ");
        }
        for(int i = 1;i<=n-1;i++)
        {
            out.print(ini + (i*i) + " ");
            ini = ini + (i*i);
        }
    }
}