public class SportCar extends Car {
    private int spoiler;

    public SportCar(int doors, int spoiler, String modelName){
        super(doors,modelName,7,"sportCar");
    }

    @Override
    public void move(){

        System.out.println("sportCar moving");
    }
}

