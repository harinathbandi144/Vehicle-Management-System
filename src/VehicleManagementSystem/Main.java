package VehicleManagementSystem;

import VehicleManagementSystem.ENUMS.PaymentStatus;
import VehicleManagementSystem.ENUMS.Status;

public class Main {
    public static void main(String[] args) {

        WorkShop workShop = new WorkShop();

        Customer customer = new Customer(101,"Harry");
        Customer customer1 = new Customer(102,"Kavya");
        Mechanic mechanic = new Mechanic(999, "Rahul", "Engine");
        Vehicle vehicle = new Vehicle(201, "1HD1BZB332Y011670", "TATA NEXON", "SUV", customer);

        ServiceJob RegJob = new RegularService(111, vehicle, "General", Status.ACCEPTED);
        ServiceJob repairJob = new RepairService(112, vehicle, "Repair", Status.ACCEPTED);
        Bill totalBill = new Bill(801, RegJob,2500, 0.18, 0.5);
        WorkshopOperation starter = new ServiceStarter();
        Payment payment = new Payment(111, totalBill, PaymentStatus.PENDING);
        System.out.println(totalBill.calculateTotal());

        payment.makePayment(2500);


//        ServiceCalculator calc = amount -> amount *0.20;
//        calc.calculateService(5000);
//        starter.perform();
//
//        WorkshopOperation operation = new ServiceCompleter();
//        operation.perform();
//
//        ServiceStarter strat = new ServiceStarter();
//        strat.perform();

        //---------------------------Anonymous Class-----------------------------//
//        WorkshopOperation workshopOperation1 = new WorkshopOperation(){
//            public void perform(){
//                System.out.println("Anonymous class started");
//            }
//        };
//        workshopOperation1.perform();
//        WorkshopOperation workshopOperation2 = new WorkshopOperation(){
//            public void perform(){
//                System.out.println("Anonymous2 class started");
//            }
//        };
//        workshopOperation2.perform();
//        workshopOperation1.perform();



        workShop.assignMechanicToJob(999,112);
//        repairJob.updateStatus(Status.INPROGRESS);
//        repairJob.completeJob(Status.FINISHED);
//        //repairJob.cancelJob(Status.CANCELLED);
//        System.out.println(repairJob.getStatus());
        //workShop.getVehicleById(999);
        //Exception
        //workShop.getCustomerById(555);
        //Job Asssigning to Mechanic
//        mechanic.assignJob(RegJob);
//        //Adding Mechanics to workshop
//        workShop.addMechanics(mechanic);
//
//        mechanic.assignJob(repairJob);
//
//        //Processing Job
//        System.out.println(workShop.processJob(repairJob));
//        System.out.println("Repair : " + workShop.calculateLabourCost(repairJob));
//        System.out.println("Regular : "+workShop.calculateLabourCost(RegJob));

        //workShop.addServiceJob(job);
        //System.out.println(job);

        //Getting mechanic details and his assigned job by id
//        System.out.println(workShop.getMechanicById(999));
//
//        //Removing Job of mechanic
//        mechanic.removeJob();




        //System.out.println(workShop.getServiceJobById(111));
//        workShop.addCustomers(customer1);
//        workShop.addVehicles(vehicle);
//
//        System.out.println(workShop.getCustomerById(102));
//        workShop.displayVehicles();

    }
}
