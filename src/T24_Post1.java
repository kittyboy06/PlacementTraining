import static java.lang.System.out;
import java.util.Scanner;

class T24_Post1
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        float cur  = inp.nextInt();
        float tot = inp.nextInt();
        int per = (int)(((tot-cur)/cur)*100.0);
        if(cur==tot)
            out.print("No Profit, No Loss");
        else if(cur<0 || tot<0)
            out.print("Invalid Input");
        else if(per>0)
            out.print("Profit - " + per + "%");
        else if (per<0)
            out.print("Loss - " + Math.abs(per) + "%");
    }
}