import java.util.Scanner;

public class Ex3    {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Magic 8 Ball");
        String question = sc.next();
        
        
        double q = Math.random() * 20;
        int n = (int)q;
        
        if(n == 1) System.out.println("As I see it, yes.");
        if(n == 2) System.out.println("Ask again later.");
        if(n == 3) System.out.println("Better not tell you now.");
        if(n == 4) System.out.println("Cannot predict now.");
        if(n == 5) System.out.println("Concetrate and ask again.");
        if(n == 6) System.out.println("Don't count on it.");
        if(n == 7) System.out.println("It is certain.");
        if(n == 8) System.out.println("It is decidedly so.");
        if(n == 9) System.out.println("Most likely.");
        if(n == 10) System.out.println("My reply is no.");
        if(n == 11) System.out.println("My sources say no.");
        if(n == 12) System.out.println("Outlook not so good.");
        if(n == 13) System.out.println("Outlook good.");
        if(n == 14) System.out.println("Reply hazy, try again.");
        if(n == 15) System.out.println("Signs point to yes.");
        if(n == 16) System.out.println("Very doubtful.");
        if(n == 17) System.out.println("Without a doubt.");
        if(n == 18) System.out.println("Yes.");
        if(n == 19) System.out.println("Yes – definitely.");
        if(n == 20) System.out.println("You may rely on it.");
    }
}
