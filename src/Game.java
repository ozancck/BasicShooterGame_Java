import java.awt.geom.Point2D;
import java.util.Random;

public class Game {


    public static void main(String[] args) {

        // Oyuncuları olusturdum ve degisken özellikleri tanimladim (taraf ve isim).
        MachineGun ak47 = new MachineGun("AK47",20,100,35,false);
        SniperRifle awp = new SniperRifle("AWP",30,150,20,false);
        MeleeWeapon carambit = new MeleeWeapon("Carambit",15,50,20,true,"non-fired");
        BAA baa= new BAA("Baa",10,50,30,true,false);

        Player kayla = new Player(false, "Kayla",true);
        Player katie = new Player(false, "Katie",false);
        Player joseph = new Player(true, "Joseph",false);

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

            System.out.println(player.getName()+" position ("+resultX+"," +resultY +")"   );



        }

        System.out.println("---------");
        kayla.addWeapon(awp);
        System.out.println("---------");
        kayla.addWeapon(ak47);
        System.out.println("---------");
        kayla.shoot(katie,ak47);
        System.out.println("---------");
        kayla.shoot(joseph,ak47);
        System.out.println("---------");
        kayla.showInventory();
        System.out.println("---------");
        kayla.scopeAttached(awp);
        System.out.println("---------");
        kayla.sweepOn(ak47);
        System.out.println("---------");
        joseph.immortal();
        System.out.println("---------");
        kayla.shoot(joseph,ak47);
        System.out.println("---------");
















    }


}