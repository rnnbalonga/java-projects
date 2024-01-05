import java.util.Scanner;

public class TempConverter {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a temperature in Celcius: ");
        //Capture user input as a double instead of an int
        double userTemp = (double) in.nextInt();
        double convertedTemp = (userTemp * 9 / 5) + 32;

        System.out.println(userTemp + "C = " + convertedTemp + " F");
    }

}
