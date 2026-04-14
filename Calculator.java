import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, result;
        char choice;

    System.out.print("Enter first number: ");
        a = sc.nextDouble();

System.out.print("Enter second number: ");
        b = sc.nextDouble();

    System.out.print("Enter operator (+, -, *, /): ");
        choice = sc.next().charAt(0);
 if (choice == '+') {
            result = a + b; } 
        else if (choice == '-') {
            result = a - b; } 
        else if (choice == '*') {
            result = a * b; } 
        else if (choice == '/') {
            if (b != 0) {
                result = a / b;
                } else {
                System.out.println("Cannot divide by zero");
                return; }  } 
        else {
            System.out.println("Invalid operator");
            return; }

        System.out.println("Result = " + result);
    }}