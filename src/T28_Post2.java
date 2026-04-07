import static java.lang.System.out;
import java.util.Scanner;

class T28_Post2
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        if(n>=1)
        {
            out.print("1 ");
        }
        for(int i = 2;i<=n;i++)
        {
            out.print((i*i) + " ");
        }
    }
}