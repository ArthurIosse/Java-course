public class Vehicle {
    private String vehicleType;
    private int steeringWheel;
    private int wheels;
    private int gears;

    public Vehicle(int steeringWheel,int wheels, int gears, String vehicleType) {
        this.steeringWheel = steeringWheel;
        this.wheels = wheels;
        this.gears = gears;
        this.vehicleType = vehicleType;
    }
    public Vehicle() {
        vehicleType = "default type";
        steeringWheel = 0;
        wheels = 0;
        gears = 0;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public int getSteeringWheel() {
        return steeringWheel;
    }

    public int getWheels() {
        return wheels;
    }

    public int getGears() {
        return gears;
    }


    public void steer(){
        System.out.println("Vehicle steering");
    }

    public void move(){
        System.out.println("Vehicle moves");
    }

    public void changeGears(){
        System.out.println("Vehicle changing gears");
    }
}
