import static java.lang.System.out;
import java.util.Scanner;
class T22_In2 {


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int r = inp.nextInt();
        int h = inp.nextInt();
        out.print(Math.round(3.14 * (r * r) * h));
    }
}