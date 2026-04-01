import static java.lang.System.out;
import java.util.Scanner;
class T21_Post2
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int age = inp.nextInt();
        String name = inp.next();
        out.print("User Details:\nName "+name+"\nAge: "+ age);
    }
}