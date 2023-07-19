public class Plane extends Vehicle{

    public int altitude;
    public int airspeed;

    public Plane(int wheels, int maxCapacity, String engineType, String fuelType, String transportType,int price, int altitude, int airspeed){
        super(wheels, maxCapacity, engineType, fuelType, transportType,price);
        this.altitude = altitude;
        this.airspeed = airspeed;
    }


    @Override
    public
    String canStart(){
        return "Doesn't need a key!";
    }

    @Override
    public String canMove(){
        return "In Air";
    }


    //Wouldn't let me run code without this not sure why
    @Override
    public
    void playRadio(){

    }
}
