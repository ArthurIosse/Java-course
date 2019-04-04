public class Main {

    public static void main(String[] args) {

        Table table = new Table(4);
        Couch couch = new Couch(6,"folded");
        TV tv = new TV(255);

        Room room = new Room(tv,couch,table,new Dimensions(5,5));
        room.getTv().turnOn();
        room.getTv().getButtonStatus();

    }
}
