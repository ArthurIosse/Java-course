public class TV {
    private int colors;
    private int button;

    public TV(int colors){
        this.colors = colors;
    }

    public void turnOn() {
        button = 1;
    }

    public void getButtonStatus(){
        System.out.println("button = " + button);
    }
}
