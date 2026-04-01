import static java.lang.System.out;
import java.util.Scanner;
class T23_In3
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        char c=inp.next().charAt(0);
        if(c == 'A' || c == 'E' || c == 'I' || c== '0' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
        {
            out.print("Vowel");
        }
        else
        {
            out.print("Consonant");
        }
    }
}