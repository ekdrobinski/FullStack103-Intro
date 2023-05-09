import java.rmi.activation.ActivationGroup_Stub;
import java.util.Scanner;
public class SameOrNah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Word: ");
        String firstWord = scanner.nextLine();
        System.out.println("Enter another Word: ");
        String secondWord = scanner.nextLine();

        if (firstWord.equals(secondWord)) {
            System.out.println("The words are the same.");
        } else {
            System.out.println("The words are different.");
        }

    }

}