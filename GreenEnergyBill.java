public class GreenEnergyBill extends EnergyBill {
    private double solarContribution; // in kWh

    private static final double SOLAR_DEDUCTION_RATE = 0.15; // per kWh

    public GreenEnergyBill(String name, String address, double electricityUsage, double gasUsage, double solarContribution) {
        super(name, address, electricityUsage, gasUsage);
        this.solarContribution = solarContribution;
    }

    @Override
    public double calculateElectricityCharge() {
        double standardCharge = super.calculateElectricityCharge();
        double deduction = solarContribution * SOLAR_DEDUCTION_RATE;
        return standardCharge - deduction;
    }

    @Override
    public void displayBill() {
        super.displayBill();
        System.out.printf("Solar Contribution: %.2f kWh%n", solarContribution);
        System.out.printf("Solar Deduction: $%.2f%n", solarContribution * SOLAR_DEDUCTION_RATE);
        System.out.printf("Total Bill with Green Energy Deduction: $%.2f%n", calculateTotalBill());
    }
}
