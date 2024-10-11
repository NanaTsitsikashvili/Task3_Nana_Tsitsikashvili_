import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weightedSum = 0;
        double totalWeight = 0;


        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter score " + i + ": ");
            double score = scanner.nextDouble();

            System.out.print("Enter weight " + i + ": ");
            double weight = scanner.nextDouble();

            weightedSum += score * weight;
            totalWeight += weight;
        }

        double weightedAverage = weightedSum / totalWeight;

        System.out.println("The weighted average is: " + weightedAverage);

        scanner.close();
    }
}