import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;
        String trash = "";

        System.out.print("Please enter your birth month [1-12]: ");
        if(in.hasNextInt())
        {
            birthMonth = in.nextInt();
            if(birthMonth >=1 && birthMonth <= 12)
            {
                System.out.println("Your birth month is: " + birthMonth);
            }
            else
            {
                System.out.println("You entered an incorrect birth month: " + birthMonth);
            }
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Please enter a valid birth month: " + trash);
            System.exit(0);
        }
    }
}