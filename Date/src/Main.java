public class Main {
    public static void main(String[] args) {
        //**
        String date = "26";
        String day = "Tuesday";
        String month = "December";
        String year = "2023";

        System.out.println("Problem #1");
        System.out.println("Date: " + date);
        System.out.println("Day: " + day);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);
        System.out.println();

        System.out.println("Problem #2");
        System.out.println(day + ", " + month + " " + date + ", " + year);
        System.out.println();

        System.out.println("Problem #3");
        System.out.println("American Format: " + day + ", " + month + " " + date + ", " + year);
        System.out.println("European Format: " + day + " " + date + " " + month + ", " + year);
        //
    }
}