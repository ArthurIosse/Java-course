public class Couch {
    private int legs;
    private String state;

    public Couch(int legs,String state){
        this.legs = legs;
        this.state = state;
    }

    public void unfold(){
        state = "unfolded";
    }
}
