package VehicleManagementSystem;

import VehicleManagementSystem.ENUMS.Status;

public class RegularService extends ServiceJob{

    public RegularService(int jobId, Vehicle vehicle, String serviceType, Status status)
    {
        super(jobId, vehicle,serviceType, status);
    }

    @Override
    public double labourCost(){
        return 500;
    }
}
