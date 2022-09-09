import java.util.*;
import java.security.*;

public class GuessGame{
    public static void main(String[] args)
    {
        Scanner take = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();

        System.out.println("\nWELCOME TO THE TERMINAL GUESS GAME BY ACE");

        System.out.print("\nName: ");
        
        String name = take.nextLine();
        System.out.print("\nAge: ");
        int age = take.nextInt();
        int bound = 10;
        int levelCount  = 1;

        if(age>0 && age<18)
        {
            System.out.println("\nHello "+name+", you are not allowed to participate in this game because of age restrictions.");
        }

        else if(age>=18 & age<=80)
        {
            for(int levels=0; levels<=1000; levels++)
            {
                System.out.print("\nGuess any number between 0 and "+bound+": ");
                int input = take.nextInt();
                int guessed = rand.nextInt(bound);
                
                

                if(guessed == input)
                {
                    System.out.print("Hurray welcome to level "+(levelCount+1)+". \nNumber of trials to the correct guess: "+levels+" trials.\n");
                    bound = bound+10;
                    levelCount = levelCount+1;
                }

                else{
                    System.out.println("\nWrong guess. Retry.\n");
                }
            }
        }
    }
}