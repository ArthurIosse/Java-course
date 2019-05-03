import java.util.ArrayList;

public class Team {
    private String name;
    int won = 0;
    int lost = 0;
    int tie = 0;
    int played = 0;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private ArrayList<Player> members = new ArrayList<>();

    public boolean addPlayer(Player player){
        if(members.contains(player)){
            System.out.println(player.getName() + " already exist in "+this.getName());
            return false;
        }else{
            members.add(player);
            System.out.println(player.getName()+" added to "+this.getName()+" team");
            return true;
        }
    }


}
