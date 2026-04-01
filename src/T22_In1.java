import static java.lang.System.out;
import java.util.Scanner;

public class T22_In1 {
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int l = inp.nextInt();
        int b = inp.nextInt();
        out.print("The required length is "+(2 * (l+b))+" m\nThe required area of carpet is "+  (l*b)+" sqm");
    }
}
