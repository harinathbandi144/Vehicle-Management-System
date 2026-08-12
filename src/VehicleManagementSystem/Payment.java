package VehicleManagementSystem;

import VehicleManagementSystem.ENUMS.PaymentStatus;

public class Payment {

    private int paymentId;
    private Bill bill;
    private double amount;
    private PaymentStatus status;

    public Payment(int paymentId, Bill bill, PaymentStatus status) {
        this.paymentId = paymentId;
        this.bill = bill;
        this.status = status;
    }

    public void makePayment(double amount){
        double billAmount = bill.calculateTotal();
        if(amount >= billAmount){
            status = PaymentStatus.PAID;
        }else {
            status = PaymentStatus.FAILED;
        }
    }

    public double refundPayment(){
       double billAmount = bill.calculateTotal();

       if (this.amount > billAmount){
           return amount - billAmount;
       }
       return 0;
    }
}
