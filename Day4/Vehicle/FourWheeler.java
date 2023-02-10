
public class FourWheeler extends Vehicle{
    private String audioSystem;
    private int numberOfDoors;

    public FourWheeler(String make, String vehicleNumber,String fuelType, int fuelCapacity, int cc, String audioSystem, int numberOfDoors){
        super(make,vehicleNumber, fuelType, fuelCapacity, cc);
        this.audioSystem =audioSystem;
        this.numberOfDoors =numberOfDoors;
        

    }
@Override
public void displayDetailInfo(){
    System.out.println("---Detail Information---");
    System.out.println("Audio System:" + audioSystem);
    System.out.println("Number of Doors" + numberOfDoors);

}


}