import java.util.Scanner;

public class Problem_1 {
    private double a;
    private double b;
    private String operation;

    public Problem_1(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation.toLowerCase();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double b = scanner.nextDouble();

        System.out.print("Enter operation : addition, subtraction, multiplication, division): ");
        scanner.nextLine();
        String operation = scanner.nextLine();

        Problem_1 calculator = new Problem_1(a, b, operation);
        try {
            System.out.println("Result: " + calculator.calculate());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }

    public double calculate() {
        switch (operation) {
            case "addition":
                return a + b;
            case "subtraction":
                return a - b;
            case "multiplication":
                return a * b;
            case "division":
                if (b == 0) {
                    throw new ArithmeticException("Division by zero is not possible");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Invalid Input");
        }
    }
}
