import java.util.Scanner;

public class HMSConverter
{
    public static void main(String[] args)
    {
        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter the number of hours: ");
        int hours = kbd.nextInt();

        System.out.print("Enter the number of minutes: ");
        int minutes = kbd.nextInt();

        System.out.print("Enter the number of seconds: ");
        int seconds = kbd.nextInt();

        int totalSeconds = (hours * 3600) + (minutes * 60) + seconds;

        System.out.println();
        System.out.println("Total seconds: " + totalSeconds);

        /* Done with Scanner, so close it */
        kbd.close();
    }
}