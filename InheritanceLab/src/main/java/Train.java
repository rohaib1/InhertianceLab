public class Train extends Vehicle{

    public int numberOfCarriages;

    public Train(int wheels, int maxCapacity, String engineType, String fuelType, String transportType,int price){
        super(wheels, maxCapacity, engineType, fuelType, transportType,price);
        this.numberOfCarriages = numberOfCarriages;
    }

    @Override
    public
    String canStart(){
        return "With train key";
    }

    @Override
    public String canMove(){
        return "On tracks";
    }

    //Wouldn't let me run code without this not sure why
    @Override
    public
    void playRadio(){

    }

    public String addFirstClass(){
        return "First class added!";
    }
}
