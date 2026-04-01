import static java.lang.System.out;
import java.util.Scanner;
class T23_Post2
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int m = (n>=100 && n<1000)?(n/10)%10:-1;
        if (m == -1)
        {
            out.print("Invalid Number");
        } else if (m%3==0)
        {
            out.print("Trendy Number");
        }
        else
        {
            out.print("Not a Trendy Number");
        }
        inp.close();
    }
}
