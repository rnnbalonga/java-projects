import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Put ending number: ");
        int end_num = scanner.nextInt();
        scanner.nextLine();

        for (int i=1; i<=end_num; i++) {
            if (i % 3 == 0 && i % 5 ==0) {
                System.out.println("Fizzbuzz");
            } else if (i % 3 == 0 ) {
                System.out.println("Fizz");
            } else if (i % 5 == 0 ) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}