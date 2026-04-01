import static java.lang.System.out;
import java.util.Scanner;
class T22_Post2
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int noc = inp.nextInt();
        int cpc  = inp.nextInt();
        int cspc = inp.nextInt();
        out.print((noc * cpc) - ((noc * cspc) + 100));
        inp.close();
    }
}
