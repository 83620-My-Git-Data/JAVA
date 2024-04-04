
import java.util.Scanner;

public class DrivingCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total miles driven per day: ");
        double milesPerDay = scanner.nextDouble();

        System.out.print("Enter cost per gallon of gasoline: ");
        double costPerGallon = scanner.nextDouble();

        System.out.print("Enter average miles per gallon: ");
        double avgMilesPerGallon = scanner.nextDouble();

        System.out.print("Enter parking fees per day: ");
        double parkingFeesPerDay = scanner.nextDouble();

        System.out.print("Enter tolls per day: ");
        double tollsPerDay = scanner.nextDouble();

        double dailyCost = calculateDrivingCost(milesPerDay, costPerGallon, avgMilesPerGallon, parkingFeesPerDay, tollsPerDay);
        System.out.println("Your daily driving cost is: $" + String.format("%.2f", dailyCost));

        scanner.close();
    }

    public static double calculateDrivingCost(double milesPerDay, double costPerGallon, double avgMilesPerGallon,
                                              double parkingFeesPerDay, double tollsPerDay) {
        double totalCost = (milesPerDay / avgMilesPerGallon) * costPerGallon + parkingFeesPerDay + tollsPerDay;
        return totalCost;
    }
}
