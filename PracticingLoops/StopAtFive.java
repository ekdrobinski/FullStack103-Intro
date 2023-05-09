import java.util.Scanner;
public class StopAtFive {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num;

        do {
            System.out.println("Enter a number: ");
            num = scanner.nextDouble();
        } while (num != 5);
    }