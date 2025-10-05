import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Player> playerList = new ArrayList<>();

        playerList.add(new Player( 1,  "Asuna",  100));
        playerList.add(new Player( 2,  "Bacon",  205));
        playerList.add(new Player( 3,  "Jett",  35));

        //System.out.println(playerList.get(1));

        playerList.add(2,new Player(553,  "Artist", 55));

        //playerList.remove(0);

        //System.out.println(playerList.contains(new Player(2,"Bacon",205)));
        System.out.println(playerList.indexOf(new Player(2, "Bacon",205)));

        //playerList.forEach(player -> System.out.println(player));

        for (Player p : playerList)
        {
            System.out.println(p);
        }
        }
    }
