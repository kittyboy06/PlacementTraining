import static java.lang.System.out;
import java.util.Scanner;
class T23_In2
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int yr = inp.nextInt();
        if(yr%4==0)
        {
            if(yr%100==0)
            {
                if(yr%400==0)
                {
                    out.print("Schedule Event");
                }
                else
                {
                    out.print("No Event This Year");
                }
            }
            else
            {
                out.print("Schedule Event");
            }
        }
        else
        {
            out.print("No Event This Year");
        }
    }
}