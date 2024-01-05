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

        int userNumber = getUserNumber();


        //Set number of tries user can guess
        int userTries = 0;

    }

    public static int getUserNumber(){
        Scanner in = new Scanner(System.in);
        int userNumber;
        System.out.print("Please select a number from 1-100: ");
        userNumber = in.nextInt();
        return userNumber;
    }

    public static boolean evaluateGuess(int userNumber, int randNumber) {
        if (userNumber == randNumber){
            System.out.println("Congratulations!");
            return true;
        } else {
            System.out.println("BATSU DESU");
            return false;
        }
    }

}
