import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    //Create randomizer
    public static void main (String[] args){
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        //Set maximum and minimum values to be randomly generated
        int maxNumber = 100;
        int minNumber = 1;
        int x = rand.nextInt((maxNumber - minNumber) + minNumber);
        System.out.println("This is the number guessing game.");
        System.out.print("Please select a number from 1-100: ");
        //Get input from user
        int userNumber = in.nextInt();
    }
}
