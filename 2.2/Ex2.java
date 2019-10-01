import java.util.Scanner;

public class Ex2    {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        System.out.println("GradeBot");

        System.out.print("What was the test out of? ");
        double d = sc.nextDouble();

        System.out.print("What did you get? ");
        double mark = sc.nextDouble();

        double p1 = mark/d;
        double f = p1 * 100;
        int ff = (int)f;
        if(ff >= 0 && ff <= 100) {
            System.out.print("You got " + ff + "% ");
        }   else    {
            System.out.print("Unknown"); 
        }
        if(ff >= 0 && ff < 50) System.out.println("That's a F... study harder next time!");
        if(ff >= 50 && ff < 60) System.out.println("That's a C-... you passed, but you can do better!");
        if(ff >= 60 && ff < 67) System.out.println("That's a C... you passed, but you can do better!");
        if(ff >= 67 && ff <= 72) System.out.println("That's a C+... you passed, but you can do better!");
        if(ff >= 73 && ff <= 85) System.out.println("That's a B... acceptable.");
        if(ff >= 83 && ff <= 100) System.out.println("That's a A... keep up the hard work!");

        if(ff > 100) System.out.println("...");
        if(ff < 0)  System.out.println("...");
    }
}
