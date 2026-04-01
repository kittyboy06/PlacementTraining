import static java.lang.System.out;
import java.util.Scanner;
class T23_In1
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int te = inp.nextInt();
        if(te <= 0)
        {
            out.print("Too cold for outdoor activities");
        }
        else
        {
            out.print("Safe for outdoor activities");
        }
    }
}