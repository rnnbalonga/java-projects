import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class NumberGuessingGame {
    //Create randomizer
    public static void main (String[] args){
        Random rand = new Random();

        //Set maximum and minimum values to be randomly generated
        int maxNumber = 100;
        int minNumber = 1;

        //Randomize number
        int randNumber = rand.nextInt((maxNumber - minNumber) + minNumber);
        System.out.println("My Number: " + randNumber);
        System.out.println("This is the number guessing game.");


        boolean result = false;

        while (result == false){
            int userNumber = getUserNumber();
            result = evaluateGuess(userNumber, randNumber);
        }
        //Set number of tries user can guess
        int userTries = 0;

    }

    public static int getUserNumber(){
        Scanner in = new Scanner(System.in);
        int userNumber;
        System.out.print("Please select a number from 1-100: ");
        userNumber = in.nextInt();
        //Create a way to make sure that a user provides a valid guess.
        return userNumber;
    }

    public static boolean evaluateGuess(int userNumber, int randNumber) {
        int numDifference = Math.abs(userNumber - randNumber);

        if (userNumber == randNumber){
            System.out.println("Congratulations!");
            return true;
        } else if (numDifference <= 5){
            System.out.println("You're SO SO SO SO SO Close");
            return false;
        } else if (numDifference > 5 && numDifference < 15) {
            System.out.println("Try a little bit closer.");
            return false;
        } else {
            System.out.println("TOO FAR BRO");
            return false;
        }
    }

}
