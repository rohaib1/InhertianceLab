public abstract class Vehicle {

    public int wheels;
    public int maxCapacity;
    public String engineType;
    public String fuelType;
    public String transportType;
    public int price;

    public Vehicle(int wheels, int maxCapacity, String engineType, String fuelType, String transportType, int price){
        this.wheels = wheels;
        this.maxCapacity = maxCapacity;
        this.engineType = engineType;
        this.fuelType = fuelType;
        this.transportType = transportType;
        this.price = price;
    }


    //Abstract Method
    public abstract String canStart();

    //Override method
    public String canMove(){
        return transportType;
    }

    public abstract
    void playRadio();
}
