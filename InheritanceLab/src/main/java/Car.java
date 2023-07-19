import interfaces.ICar;

public class Car extends Vehicle implements ICar {

    public int numberOfDoors;
    private boolean ambientLighting;

    public Car(int wheels, int maxCapacity, String engineType, String fuelType, String transportType, int numberOfDoors,int price){
        super(wheels, maxCapacity, engineType, fuelType, transportType,price);
        this.numberOfDoors = numberOfDoors;
        this.ambientLighting = false;
    }

    public boolean hasAmbientLighting(){
        return ambientLighting;
    }

    public void turnOnLights(){
        ambientLighting = true;
    }

    public void turnOffLights(){
        ambientLighting = false;
    }

    public int getPrice(){
        return price;
    }



    @Override
    public String canStart(){
        return "With Key";
    }

    @Override
    public String canMove(){
        return "On road";
    }

    @Override
    public void playRadio(){
        System.out.println("Playing Radio");
    }
}
