package VehicleManagementSystem;

public class Mechanic {
    private int mechanicId;
    private String mechanicName;
    private String specialization;
    private ServiceJob job;

    public Mechanic(int mechanicId, String mechanicName, String specialization) {
        this.mechanicId = mechanicId;
        this.mechanicName = mechanicName;
        this.specialization = specialization;

    }

    public void assignJob(ServiceJob job){
        this.job = job;
    }
    public void removeJob(){
        System.out.println("Job Removed! ");
            this.job = null;
    }
    public int getMechanicId() {
        return mechanicId;
    }

    public String getMechanicName() {
        return mechanicName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public ServiceJob getJob() {
        return job;
    }

    public String toString(){
        return "\nMechanic Id : "+mechanicId+
                "\nMechanic Name : "+mechanicName+
                "\nSpecialisation : "+specialization+
                "\nJob : "+job+
                "\n";
    }

}
