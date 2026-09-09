import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Choose the symbol(+, -, *, /): ");
        String symbol = scanner.next();

        switch(symbol) {
            case "+": 
                System.out.println("The addition of " + num1 + " and " + num2 + " is: " + (num1 + num2));
                break;

            case "-":
                System.out.println("The subtraction of " + num1 + " and " + num2 + " is: " + (num1 - num2));
                break;
            
            case "*":
                System.out.println("The multiplication of " + num1 + " and " + num2 + " is: " + (num1 * num2));
                break;
            
            case "/":
                if (num2 == 0) System.out.println("Division by 0 is undefined");
                else System.out.println("The division of " + num1 + " and " + num2 + " is: " + (num1 / num2));
                break;
        }

        scanner.close();

    }
}