import java.util.ArrayList;

public class VehicleDealership {

    private ArrayList<Vehicle> vehicles;
    private String name;
    public static int balance;

    public VehicleDealership(){
        this.vehicles = new ArrayList<>();
    }

    public void sellVehicle(Vehicle vehicle,int price){
        balance = balance + price;
    }


}
