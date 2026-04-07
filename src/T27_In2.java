import static java.lang.System.out;
import java.util.Scanner;

class T27_In2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int count = 0;

        for (int num = n1; num <= n2; num++)
        {

            int temp = num;
            boolean[] seen = new boolean[10];
            boolean unique = true;

            while (temp > 0)
            {
                int digit = temp % 10;

                if (seen[digit])
                {
                    unique = false;
                    break;
                }

                seen[digit] = true;
                temp = temp / 10;
            }

            if (unique)
            {
                count++;
            }
        }

        out.print(count);
    }
}