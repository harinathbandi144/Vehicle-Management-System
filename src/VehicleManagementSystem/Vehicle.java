package VehicleManagementSystem;

public class Vehicle {

    private int id;
    private String vin;
    private String model;
    private String type;

    private Customer customer;

    public Vehicle(int id, String vin, String model, String type, Customer customer) {
        this.id = id;
        this.vin = vin;
        this.model = model;
        this.type = type;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public String getVin() {
        return vin;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String toString(){
        return "\n\nVehicle ID : "+id+
                "\nVIN : "+vin+
                "\nModel : "+model+
                "\nType : "+type+
                "\nCustomer : "+customer+
                "\n";
    }
}
