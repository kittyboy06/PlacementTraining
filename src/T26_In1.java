import static java.lang.System.out;
import java.util.Scanner;

public class T26_In1
{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        if (n <= 1) {
            out.print("Regular Product");
            return;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                out.print("Regular Product");
                return;
            }
        }

        out.print("Premium Product");
    }
}