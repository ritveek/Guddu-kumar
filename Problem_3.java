import java.util.Scanner;

public class Problem_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int a = scanner.nextInt();

        if(a%2==0){
            a=a-1;
        }

        for (int i = 1; i <= a; i++) {
            System.out.print((2 * i - 1));
            if (i < a) {
                System.out.print(", ");
            }
        }
    }
}
