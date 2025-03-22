import java.util.Scanner;

public class ArithmeticOperationsMenu 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        int choice;
        double num1, num2, result;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Modulus");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");
            choice = scanner.nextInt();

            if (choice >= 1 && choice <= 5) 
            {
                System.out.print("Enter first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
            } 
            else if (choice == 6) 
            {
                System.out.println("Exiting program.");
                break;
            } 
            else 
            {
                System.out.println("Invalid choice! Please try again.");
                continue;
            }

            switch (choice) 
            {
                case 1:
                    result = num1 + num2;
                    System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                    } else {
                        System.out.println("Error! Division by zero is not allowed.");
                    }
                    break;
                case 5:
                    result = num1 % num2;
                    System.out.println("Result: " + num1 + " % " + num2 + " = " + result);
                    break;
            }
        } while (choice != 6);

        scanner.close();
    }
}