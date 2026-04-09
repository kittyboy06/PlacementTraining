import static java.lang.System.out;
import java.util.Scanner;

class T29_In2
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int ini = n;
        out.print(n + " ");
        while(ini != 1)
        {
            if(ini%2==0)
            {
                ini/=2;
                out.print(ini + " ");
            }
            else
            {
                ini = (ini * 3) + 1;
                out.print(ini + " ");
            }
        }
    }
}