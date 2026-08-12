package VehicleManagementSystem;

public class Bill {
    private int billId;
    private ServiceJob serviceJob;
    private double partsCost;
    private double tax;
    private double discount;

    public Bill(int billId, ServiceJob serviceJob, double partsCost, double tax, double discount) {
        this.billId = billId;
        this.serviceJob = serviceJob;
        this.partsCost = partsCost;
        this.tax = tax;
        this.discount = discount;
    }

    public double calculateTotal(){
        return serviceJob.labourCost()
                +partsCost
                +tax
                -discount;
    }
}
