import static java.lang.System.out;
import java.util.Scanner;

class T29_In3
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int f = inp.nextInt();
        int r = inp.nextInt();
        int n = inp.nextInt();
        int ini = f;
        for(int i = 0;i<n;i++)
        {
            out.print((int)(ini*Math.pow(r,i)) + " ");
        }
    }

}