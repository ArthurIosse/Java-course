public class Car extends Vehicle {
    private String modelName;
    private int doors;

    public Car(int doors, String modelName, int gears, String vehicleType){
        super(1,4,gears,vehicleType);
        this.doors = doors;
        this.modelName = modelName;
    }

    public Car() {
        this.modelName = "default name";
    }

    public String getModelName() {
        return modelName;
    }

    public int getDoors() {
        return doors;
    }
}
