import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class NumberGuessingGame {
    //Create randomizer
    public static void main (String[] args){
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        //Set maximum and minimum values to be randomly generated
        int maxNumber = 100;
        int minNumber = 1;

        //Randomize number
        int randNumber = rand.nextInt((maxNumber - minNumber) + minNumber);
        System.out.println("This is the number guessing game.");


        //Ask for User Number
        int userNumber = in.nextInt();

        //Set number of tries user can guess
        int userTries = 5;
        int numDifference = Math.abs(userNumber - randNumber);
    }

    public static int getUserNumber(int userNumber){
        System.out.print("Please select a number from 1-100: ");
        return 0;
    }

    public static int getDifference(int randNum, int userNum){
        return Math.abs(userNum - randNum);
    }
}
