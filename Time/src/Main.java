public class Main {
    public static void main(String[] args) {
        int currentHour = 18;
        int currentMinute = 0;
        int currentSeconds = 30;
        final int MIDNIGHT_END = 84000; //This is the number of seconds in a day

        int hoursToSeconds = (currentHour * 60) * 60; //60 minutes in an hour, 60 secs in a minute
        int minutesToSeconds = currentMinute * 60; //60 seconds in a minute

        //Calculate Seconds Past Midnight
        int secondsPastMidnight = hoursToSeconds + minutesToSeconds + currentSeconds;
        System.out.println("Seconds past midnight: " + secondsPastMidnight); //expected answer 64830

        //Calculate Seconds Before Midnight
        int secondsBeforeMidnight = MIDNIGHT_END - secondsPastMidnight;
        System.out.println("Seconds before midnight: " + secondsBeforeMidnight); //expected answer 19170

        //Calculate Percentage of Day Passed
        double percentDayPassed = ((double) secondsPastMidnight / (double) MIDNIGHT_END) * 100;
        System.out.printf("Percent of day passed: %.2f", percentDayPassed);
        System.out.print("%");
        System.out.println();

        //Save previous current values to workStart variables
        int workStartHour = currentHour;
        int workStartMinute = currentMinute;
        int workStartSeconds = currentSeconds;

        //Reassign new values to current hour, minute, and seconds
        currentHour = 20;
        currentMinute = 50;
        currentSeconds = 40;

        int elapsedTime = workStartHour - currentHour;
        int elapsedMinute = 0;

    }
}