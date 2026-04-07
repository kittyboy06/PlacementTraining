import static java.lang.System.out;
import java.util.*;

class T27_In1
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        String f = inp.nextLine();
        int n = inp.nextInt();
        String[] arr = f.split("");
        out.print(n<=arr.length-2?arr[n-1]:-1);
    }
}