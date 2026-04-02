import static java.lang.System.out;
import java.util.*;
public class T24_In3
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();
        if(a==b && a>c)
            out.print(c);
        else if(a==c && a>b)
            out.print(a);
        else if(b==c && b>a)
            out.print(a);
        else if((a>=b && a<=c) || (a>=c && a<=b))
        {
            out.print(a);
        }
        else if((b>=a && b<=c) || (b>=c && b<=a))
        {
            out.print(b);
        }
        else
        {
        out.print(c);
        }
    }
}
