import static java.lang.System.out;
import java.util.Scanner;

class T25_In3
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int yr = inp.nextInt();
        if((yr%4==0 && yr%100!=0) || yr%400==0)
        {
            out.print(yr);
        }
        else
        {
            while(true)
            {
                if((yr%4==0 && yr%100!=0) || yr%400==0)
                {
                    break;
                }
                else
                {
                    yr++;
                }
            }
            out.print(yr);
        }
    }
}