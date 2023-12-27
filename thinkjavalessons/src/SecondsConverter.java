import java.util.Scanner;
public class SecondsConverter {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of seconds: ");
        //Capture user input
        int userSeconds = in.nextInt();
        int hours = userSeconds / 3600;
        int minutes = (userSeconds % 3600) / 60;
        int seconds = userSeconds % 60;
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
    }
}
