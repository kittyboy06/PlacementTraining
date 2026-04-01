import static java.lang.System.out;
import java.util.Scanner;

class T21_Post3
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        String name = inp.nextLine();
        String ship = inp.nextLine();
        out.print("Member Name: " + name + "\nSelected Membership: " + ship);
        inp.close();
    }
}