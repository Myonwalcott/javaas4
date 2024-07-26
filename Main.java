import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();

        System.out.print("Enter customer address: ");
        String address = scanner.nextLine();

        System.out.print("Enter electricity usage (kWh): ");
        double electricityUsage = scanner.nextDouble();

        System.out.print("Enter gas usage (units): ");
        double gasUsage = scanner.nextDouble();

        System.out.print("Is the customer using green energy? (yes/no): ");
        String greenEnergyResponse = scanner.next();

        if (greenEnergyResponse.equalsIgnoreCase("yes")) {
            System.out.print("Enter solar energy contribution (kWh): ");
            double solarContribution = scanner.nextDouble();

            GreenEnergyBill greenEnergyBill = new GreenEnergyBill(name, address, electricityUsage, gasUsage, solarContribution);
            greenEnergyBill.displayBill();
        } else {
            EnergyBill energyBill = new EnergyBill(name, address, electricityUsage, gasUsage);
            energyBill.displayBill();
        }

        scanner.close();
    }
}
