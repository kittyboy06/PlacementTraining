import static java.lang.System.out;
import java.util.Scanner;
class T24_In2
{
    public static void main(String[] args)
    {

        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();
        out.print((a > b) ? ((a > c) ? a : c) : (b > c) ? b : c);
    }
}