import static java.lang.System.out;
import java.util.Scanner;
class T23_Post1
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        String n = inp.nextLine();
        n = n.toLowerCase();
        switch (n)
        {
            case "rock":
                out.print("Paper");
                break;
            case "paper":
                out.print("Scissors");
                break;
            case "scissors":
                out.print("Rock");
                break;
        }
        inp.close();
    }
}
