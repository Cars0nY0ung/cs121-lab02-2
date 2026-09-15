import java.util.Scanner;

public class SecondsConverter
{
    public static void main(String[] args)
    {
        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter the number of seconds: ");
        int totalSeconds = kbd.nextInt();

        int hours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;

        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;

        System.out.println();
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);

        /* Done with Scanner, so close it */
        kbd.close();
    }
}
