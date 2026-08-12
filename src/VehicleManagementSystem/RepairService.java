package VehicleManagementSystem;

import VehicleManagementSystem.ENUMS.Status;

public class RepairService extends ServiceJob{

    public RepairService(int jobId, Vehicle vehicle, String serviceType, Status status)
    {
        super(jobId, vehicle,serviceType, status);
    }

    @Override
    public double labourCost(){
        return 1200;
    }

}
