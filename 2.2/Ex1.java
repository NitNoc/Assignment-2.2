import java.util.Scanner;

public class Ex1    {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the Password? ");
        String word = sc.next();
        System.out.println(word);
        
        if(word.equals("dragon"))    {
            System.out.println("Correct! My secret is: unknown");
        }   else    {
            System.out.println("Incorrect PAssword! My secret is still safe...");
        }
    } 
}
