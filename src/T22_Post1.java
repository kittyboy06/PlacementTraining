import static java.lang.System.out;
import java.util.Scanner;
class T22_Post1
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int c1 = inp.nextInt();
        int c2 = inp.nextInt();
        int t1= c1 * c2;
        int t2 = t1%12;
        t2 = t2==0?12:t2;
        out.print(t2);
    }
}