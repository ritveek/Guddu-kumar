import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int a = scanner.nextInt();

        for (int i = 1; i <= a; i++) {
            System.out.print((2 * i - 1));
            if (i < a) {
                System.out.print(", ");
            }
        }
    }
}
