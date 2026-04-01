import static java.lang.System.out;
import java.util.Scanner;
class T22_Post3
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int noc = inp.nextInt();
        out.print((noc % 10)+(noc / 1000));
        inp.close();
    }
}
