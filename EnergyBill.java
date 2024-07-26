public class EnergyBill {
    private String name;
    private String address;
    private double electricityUsage; // in kWh
    private double gasUsage; // in units

    private static final double ELECTRICITY_RATE = 0.12; // per kWh
    private static final double GAS_RATE = 0.09; // per unit

    public EnergyBill(String name, String address, double electricityUsage, double gasUsage) {
        this.name = name;
        this.address = address;
        this.electricityUsage = electricityUsage;
        this.gasUsage = gasUsage;
    }

    public double calculateElectricityCharge() {
        return electricityUsage * ELECTRICITY_RATE;
    }

    public double calculateGasCharge() {
        return gasUsage * GAS_RATE;
    }

    public double calculateTotalBill() {
        return calculateElectricityCharge() + calculateGasCharge();
    }

    public void displayBill() {
        System.out.println("Customer Name: " + name);
        System.out.println("Customer Address: " + address);
        System.out.println("Electricity Usage: " + electricityUsage + " kWh");
        System.out.println("Gas Usage: " + gasUsage + " units");
        System.out.printf("Electricity Charge: $%.2f%n", calculateElectricityCharge());
        System.out.printf("Gas Charge: $%.2f%n", calculateGasCharge());
        System.out.printf("Total Bill: $%.2f%n", calculateTotalBill());
    }
}
