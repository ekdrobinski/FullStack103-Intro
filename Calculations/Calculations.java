import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        double inputOne = scanner.nextDouble();
        System.out.println("Enter a number");
        double inputTwo = scanner.nextDouble();

        //Addition
        double sum = inputOne + inputTwo;
        //Subtraction
        double difference = inputOne - inputTwo;
        //Multiplication
        double product = inputOne * inputTwo;
        //Division
        double quotient = inputOne / inputTwo;
        //Modulus Remainder
        double remainder = inputOne % inputTwo;

        System.out.println(inputOne + " + " + inputTwo + " = " + sum);
        System.out.println(inputOne + " - " + inputTwo + " = " + difference);
        System.out.println(inputOne + " * " + inputTwo + " = " + product);
        System.out.println(inputOne + " / " + inputTwo + " = " + quotient);
        System.out.println(inputOne + " % " + inputTwo + " = " + remainder);



    }
}