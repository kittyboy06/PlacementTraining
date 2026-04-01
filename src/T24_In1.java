import static java.lang.System.out;
import java.util.Scanner;
class T24_Post1
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int c1= inp.nextInt();
        int h = inp.nextInt();
        int c2 = inp.nextInt();
        int totM = inp.nextInt();
        int totH = (int)Math.ceil(totM/60.0);
        int t1,t2,t;
        if(totH>h)
        {
                t1 = h * c1;
                t2 = (totH-h) * c2;
                t = t1+t2;
        }
        else
        {
            t = totH * c1;
        }
        out.print(t);
    }
}