import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" კურსი USD to EUR: ");
        double exchangeRate = scanner.nextDouble();

        System.out.print("რაოდენობა  USD : ");
        double usdAmount = scanner.nextDouble();

        System.out.print(" საკომისიო: ");
        double feePercentage = scanner.nextDouble();


        double eurReceived = usdAmount * exchangeRate * (1 - feePercentage / 100);


        System.out.printf("Amount to receive: " + eurReceived + "EUR");

        scanner.close();
    }
}