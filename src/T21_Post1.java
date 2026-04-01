
import static java.lang.System.out;
import java.util.Scanner;
class T21_Post1
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in); String name= inp.nextLine();
        int age = inp.nextInt();
        float gpa = inp.nextFloat();
        int g = (int) (gpa* 100);
        float cgpa = (float) (g / 100.0);
//out.println(cgpa);
        char grade = inp.next().charAt(0);
        out.print("Name: "+ name + "\nAge : " +age + "\nCGPA: " + String.format("%.2f", cgpa) + "\nGrade: "+ grade);
                //out.printf("Name: %s\nAge: %d\nCGPA: %f\nGrade: %c", name, age, cgpa, grade);
    }
}