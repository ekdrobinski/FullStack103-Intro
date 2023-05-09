import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number:");
        int num = scanner.nextInt();

        for( int i = 1; i <= 10; i++) {
            int product = num * i;5
            System.out.println(num + " x " + i + " = " + product);
        }
    }
}