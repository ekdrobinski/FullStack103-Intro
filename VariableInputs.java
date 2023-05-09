import java.util.Scanner;
public class VariableInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string of text:");
        String stringOne = scanner.nextLine();
        System.out.println("Enter an integer:");
        int integerOne = scanner.nextInt();
        System.out.println("Enter a double:");
        double doubleOne = scanner.nextDouble();
        System.out.println("Enter a boolean:");
        boolean booleanOne = scanner.nextBoolean();


        System.out.println("Your string is  " + stringOne);
        System.out.println("Your integer is  " + integerOne);
        System.out.println("Your double is " + doubleOne);
        System.out.println("Your double is " + booleanOne);
    }
}