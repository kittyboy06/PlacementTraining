import static java.lang.System.out;
import java.util.Scanner;

class T24_Post2
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int age = inp.nextInt();
        float time = inp.nextFloat();
        float p = 0;
        if(age<=13)
        {
            p = 2;
        }
        else
        {
            if(time<18.00 && time>=13.30)
            {
                p = 2;
            }
            else
                p = 5;
        }
        out.printf("$%.2f",p);
    }
}