
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("რიცხვი 1: ");
        int num1 = scanner.nextInt();

        System.out.print("რიცხვი 2: ");
        int num2 = scanner.nextInt();

        System.out.print("Operator (+, -, *, /): "); // Changed // to /
        String operator = scanner.next();

        if (operator.equals("+")) {
            int result = num1 + num2;
            System.out.println("Result: " + result);
        } else if (operator.equals("-")) {
            int result = num1 - num2;
            System.out.println("Result: " + result);
        } else if (operator.equals("*")) {
            int result = num1 * num2;
            System.out.println("Result: " + result);
        } else if (operator.equals("/")) { // Changed // to /
            if (num2 != 0) {
                int result = num1 / num2;
                System.out.println("Result: " + result);
            } else {
                System.out.println("შეცდომა ნულზე გაყოფა არ შეიძლება.");
            }
        }

        scanner.close();
    }
}