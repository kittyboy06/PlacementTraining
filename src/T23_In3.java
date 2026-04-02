import static java.lang.System.out;
import java.util.Scanner;
class T23_In3
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        char c=inp.next().charAt(0);
        if(!Character.isLetter(c))
            out.print("Not an alphabet");
        if(c == 'A' || c == 'E' || c == 'I' || c== 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
        {
            out.print("Vowel");
        }
        else if(Character.isLetter(c))
        {
            out.print("Consonant");
        }
    }
}