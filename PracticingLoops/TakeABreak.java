import java.util.Scanner;
public class TakeABreak {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String response;

        do {
            System.out.println("Do you want to take a break?");
            response = scanner.nextLine();
        } while (!response.equals("yes"));
    }
}