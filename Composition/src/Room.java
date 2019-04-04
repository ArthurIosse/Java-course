

public class Room {
    private TV tv;
    private Couch couch;
    private Table table;
    private Dimensions dimensions;

    public Room(TV tv, Couch couch,Table table,Dimensions dimensions){
        this.tv = tv;
        this.couch = couch;
        this.table = table;
    }

    public TV getTv(){
        return this.tv;
    }

}
