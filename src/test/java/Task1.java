import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("რიცხვი a: ");
        double a = scanner.nextDouble();
        System.out.print("რიცხვი b: ");
        double b = scanner.nextDouble();
        System.out.print("რიცხვი c: ");
        double c = scanner.nextDouble();


        double numerator = Math.pow(a, 3) + Math.pow(b, 2) - Math.sqrt(c);
        double denominator = a * b + c;
        double result = numerator / denominator;


        System.out.println("Result: " + result);

        scanner.close();
    }
}