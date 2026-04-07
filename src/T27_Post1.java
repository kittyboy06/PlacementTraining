import static java.lang.System.out;
import java.util.Scanner;

class T27_Post1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n == 0)
        {
            System.out.print(0);
            return;
        }

        String binary = "";

        while (n > 0)
        {
            int rem = n % 2;
            binary = rem + binary;
            n = n / 2;
        }

        out.print(binary);
    }
}