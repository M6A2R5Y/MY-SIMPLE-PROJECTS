import java.util.Scanner;

import java.security.SecureRandom;

/*
This is a simple java program that will run in the terminal.
It is intended to provide users with secure passwords that will help them keep their files safe in a password protected vault/sites.
I will add filehandling to this program if there's any needed.
*/

public class StrongPassword{
    public static void main(String[] args)
    {
        SecureRandom rand = new SecureRandom();
        Scanner in = new Scanner(System.in);

        String letters[] =    {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
                            "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",
                            "!", "@", "#", "%", "~", "&", "*", "?", "|", "-", "_", "+",
                            "1", "2", "3", "4", "5", "6", "7", "8", "9", "0"
                            };
        int len, i; 
        System.out.print("\nInput your desired password length: ");
        len = in.nextInt();
        int lettersLength = letters.length;

        System.out.print("\nYour secure password is: ");

        for(i=0; i<len;i++)
        {
            int det = rand.nextInt(lettersLength);
            System.out.print(letters[det]);
        }

        
    }
}
