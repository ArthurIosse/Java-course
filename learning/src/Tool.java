public abstract class Tool {

    private String name;
    private double weight;

    public Tool(String name,double weight){
        this.name = name;
        this.weight = weight;
    }

    public String getName(){
        return name;
    }

    public abstract void makeWork();


}
