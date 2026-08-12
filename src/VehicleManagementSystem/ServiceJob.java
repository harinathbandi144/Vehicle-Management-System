package VehicleManagementSystem;

import VehicleManagementSystem.CustomException.InvalidServiceStatusException;
import VehicleManagementSystem.ENUMS.Status;

public abstract class ServiceJob {

    private int jobId;
    private Vehicle vehicle;
    private String serviceType;
    private Status status;

    public ServiceJob(int jobId, Vehicle vehicle, String serviceType, Status status) {
        this.jobId = jobId;
        this.vehicle = vehicle;
        this.serviceType = serviceType;
        this.status = status;
    }

    abstract double labourCost();

    public void updateStatus(Status newStatus){
        try {
            if (this.status == Status.ACCEPTED && newStatus == Status.INPROGRESS) {
                this.status = newStatus;
            } else if (this.status == Status.INPROGRESS && newStatus == Status.FINISHED) {
                this.status = newStatus;
            }else {
                throw new InvalidServiceStatusException("Invalid Status");
            }
        }catch (InvalidServiceStatusException e){
            System.out.println(e.getMessage());
        }


    }

    public void completeJob(Status completeStatus){
        try {
            if (this.status == Status.INPROGRESS && completeStatus == Status.FINISHED) {

                this.status = completeStatus;
                System.out.println("Job is Completed");
            }
            else if(this.status == Status.STARTED && completeStatus == Status.FINISHED){
                this.status = completeStatus;
                System.out.println("Job is Completed");
            }else {
                throw new InvalidServiceStatusException("Invalid Status!!" +completeStatus);
            }

        }catch (InvalidServiceStatusException e){
            System.out.println(e.getMessage());
        }
    }





































    public void cancelJob(Status cancelJob){
        try{
            if (this.status == Status.INPROGRESS && cancelJob == Status.CANCELLED){
                this.status = cancelJob;
            }
            else if(this.status == Status.ACCEPTED && cancelJob == Status.CANCELLED){
                this.status = cancelJob;
            }else {
                throw new InvalidServiceStatusException("Invalid Status");
            }
        }catch (InvalidServiceStatusException e){
            System.out.println(e.getMessage());
        }
    }


    public int getJobId() {
        return jobId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public String getServiceType() {
        return serviceType;
    }

    public Status getStatus() {
        return status;
    }

    public String toString(){
        return "Job Id : "+jobId+
                "\nVehicle : "+vehicle+
                "\nService Type : "+serviceType+
                "\nStatus : "+status+
                "\n";
    }
}
