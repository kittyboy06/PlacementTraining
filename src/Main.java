import static java.lang.System.out;
import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        out.print((n/10)%10);
        inp.close();
    }
}
