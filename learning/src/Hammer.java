public class Hammer extends Tool {

    private String handleType;

    public Hammer(String name, double weight, String handleType) {
        super(name, weight);
        this.handleType = handleType;
    }

    @Override
    public void makeWork(){
        System.out.println("Hitting the nail");
    }
}
