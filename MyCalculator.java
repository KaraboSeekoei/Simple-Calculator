import java.util.Scanner;
// Karabo Seekoei */
public class MyCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to the Simple Calculator!");
        System.out.println("This calculator can perform basic arithmetic operations.");

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            System.out.print("1.Sum\n2.Difference\n3.Product\n4.Division\nEnter number 1, 2, 3, or 4: ");
            int answer = scanner.nextInt();

            if (answer == 1) {
                int sum = num1 + num2;
                System.out.println("Sum: " + sum);
            }
            else if (answer == 2) {
                int difference = num1 - num2;
                System.out.println("Difference: " + difference);
            }
            else if (answer == 3) {
                int product = num1 * num2;
                System.out.println("Product: " + product);
            }
            else if (answer == 4) {
                int quotient = num1 / num2;
                System.out.println("Quotient: " + quotient);
            }

            else System.out.println("Invalid input! Please enter a number 1, 2, 3, or 4.");
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid integer.");
        }

        scanner.close();
    }
}
