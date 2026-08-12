package VehicleManagementSystem;


import VehicleManagementSystem.CustomException.CustomerNotFoundException;
import VehicleManagementSystem.CustomException.InvalidServiceStatusException;
import VehicleManagementSystem.CustomException.VehicleNotFoundException;

import java.util.ArrayList;

public class WorkShop {

    private ArrayList<Customer> customers;
    private ArrayList<Vehicle> vehicles;
    private ArrayList<ServiceJob> serviceJobs;
    private ArrayList<Mechanic> mechanics;

    public WorkShop(){
        customers = new ArrayList<>();
        vehicles = new ArrayList<>();
        serviceJobs = new ArrayList<>();
        mechanics = new ArrayList<>();
    }

    public double calculateLabourCost(ServiceJob job){
      return job.labourCost();
    }

    public void addMechanics(Mechanic mechanic){
        mechanics.add(mechanic);
    }

    public void addCustomers(Customer customer){
        customers.add(customer);
    }

    public void addVehicles(Vehicle vehicle){
        vehicles.add(vehicle);
    }

    public void addServiceJob(ServiceJob serviceJob){
        serviceJobs.add(serviceJob);
    }
    public String processJob(ServiceJob job){
        double labourCost = calculateLabourCost(job);
        return "Job : "+job+
                "\nLabour Cost : "+labourCost;
    }

    public ServiceJob getServiceJobById(int jobId) throws CustomerNotFoundException {
        for(ServiceJob s :serviceJobs){
            if(jobId == s.getJobId()){
                return s;
            }
        }
        throw new CustomerNotFoundException(
                "Customer Id: "+jobId+"Not Found"
        );
    }


    public Mechanic getMechanicById(int id) throws CustomerNotFoundException

    {
        try {
            for (Mechanic m : mechanics) {
                if (id == m.getMechanicId()) {
                    return m;
                }
            }
            throw new CustomerNotFoundException("Not found");
        }
        catch(CustomerNotFoundException e){
            System.out.println(e.getMessage());
            return null;
        }
    }


    public Customer getCustomerById(int customerId){

        try {
            for (Customer c : customers) {
                if (customerId == c.getCustomerId()) {
                    return c;
                }
            }
        throw new CustomerNotFoundException("Customer Id Is not found : "+customerId);
        }
        catch (CustomerNotFoundException e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public void displayCustomerDetails(){
        for(Customer c : customers){
            System.out.println(c);
        }
    }

    public void displayVehicles(){
        for(Vehicle v:vehicles){
            System.out.println(v);
        }
    }

    public void assignMechanicToJob(int mechid, int jobId){
        try{
            Mechanic mechanic = getMechanicById(mechid);
            ServiceJob serviceJob = getServiceJobById(jobId);

            throw new InvalidServiceStatusException("Mechanic Not Found");
        }catch (InvalidServiceStatusException | CustomerNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
    public Vehicle getVehicleById(int vehicle){

        try {
            for (Vehicle v : vehicles) {
                if (vehicle == v.getId()) {
                    return v;
                }
            }
            throw new VehicleNotFoundException("Vehicle Not found : " + vehicle);

        }
        catch (VehicleNotFoundException e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
