import java.awt.geom.Point2D;
import java.util.Random;

public class Game {


    public static void main(String[] args) {


        Machine m249 = new Machine("M249",20,100,35,false);
        Sniper m24 = new Sniper("M24",30,150,20,false);
        MeleeW combatKnife = new MeleeW("Combat Knife",15,50,20,true,"non-fired");
        BrowAndArrow arrow= new BrowAndArrow("arrow",10,50,30,true,false);

        Player kayla = new Player("Kayla", false,true);
        Player katie = new Player("Katie", false,false);
        Player joseph = new Player("Joseph", true,false);


        Player[] players = new Player[3];
        Player[][] map= new Player[100][50];

        players[0]=katie;
        players[1]=kayla;
        players[2]=joseph;

        for (Player player:players){
            Random r = new Random();
            int low = 0;
            int high = 100;
            int resultX = r.nextInt(high-low) + low;

            int low1 = 0;
            int high1 = 50;
            int resultY = r.nextInt(high1-low1) + low1;

            player.setxPosition(resultX);
            player.setyPosition(resultY);
            map[resultX][resultY]=player;

            }


        kayla.position();
        katie.position();
        joseph.position();


        System.out.println("---------");
        kayla.addWeapon(m24);
        System.out.println("---------");
        kayla.addWeapon(m249);
        System.out.println("---------");
        kayla.showInventory();
        System.out.println("---------");
        kayla.shoot(katie,m249);
        System.out.println("---------");
        kayla.shoot(joseph,m249);
        System.out.println("---------");
        kayla.scopeAttached(m24);
        System.out.println("---------");
        kayla.sweepOn(m24);
        System.out.println("---------");
        kayla.sweepOn(m249);
        System.out.println("---------");
        kayla.shoot(joseph,m249);
        System.out.println("---------");
        kayla.shoot(joseph,combatKnife);
        System.out.println("---------");
        joseph.immortal();
















    }


}