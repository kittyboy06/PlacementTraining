import static java.lang.System.out;
import java.util.Scanner;

class T28_In2
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        double ini = 95.0;
        if(n>=1)
        {
            out.print(ini + " ");
        }
        for(int i = 0;i<n-1;i++)
        {
            out.print(ini + 20.5 + " ");
            ini+=20.5;
        }
    }
}
