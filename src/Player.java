import java.text.DecimalFormat;

public class Player {

    //there is 5 properties.
    private String name;
    private int healt=100;
    private int money=1000;
    private boolean terorist;
    private Guns gun;


    //first method about shooting. Choose who you want to shoot.
    public void shoot( Player y) {
        //if you shoot to your friend
        if (this.terorist == y.terorist) {
            System.out.println("Failed! Target player is on the same side!");
        }
        //not your friend
        else {

            //random for 0.3 misfired possibility.
            // if number in 0<= number <7, there is no misfired but,
            // number in 7<= number <10, there is misfired
            double number =(double)(Math.random());
            double _number = Double.parseDouble(new DecimalFormat("0.0").format(number));

            if (_number >=this.getGuns().getMisFired()) {

                // health 20 decreasing
                y.healt-=20;
                if (y.healt>=0){
                    //bullet decreasing
                    //this.bullet-=1;
                    getGuns().bulletDecreased();

                    System.out.println("Success! pinpoint accuracy!");
                    System.out.println("Info: There are "+getGuns().getBullets()+ " bullet(s) left in "+this.name+"'s magazine.");
                    System.out.println("Info: "+y.name+"'s health level is decreased to "+y.healt+".");
                }
                else {

                    //health is 0
                    System.out.println("Failed! The enemy is already dead!");
                }

            }
            else {
                //this.bullet-=1;
                gun.bulletDecreased();
                System.out.println("Failed! Pistol misfired!");
            }


        }

    }

    // take cure
    public void takeCure(){
        //new health will be 100
        //money is reduced by 500
        this.setHealt(100);
        this.money-=500;

        System.out.println("Success! joseph is now as fit as s(he) has never been before!");
        System.out.println("Info: joseph's health level is now "+this.healt+".");
        System.out.println("Info: joseph has now "+this.money+" dollars!");
    }

    //load magazine
    public void loadMagazine(){

        //"lls" is a constant. For need bullet.
        //new bullet will be 20
        //We paid for needBullet
        //int needBullet = lls-this.bullet;
        int needBullet = gun.getA() -gun.getBullets();
        gun.reload();
        this.money-=needBullet* gun.getBulletCost();

        System.out.println("Success! The real war begins now!");
        System.out.println("Info: kayla has now "+gun.getBullets()+" bullets in the magazine!");
        System.out.println("Info: kayla has now "+this.money+" dollars!");
    }

    public void loansMoney(Player x){
        if (this.terorist==x.terorist){
            System.out.println("Success! kayla is a perfect philanthropist!");
            this.money-=100;
            x.money+=100;
            System.out.println("Info: "+this.name+" has now "+this.money+" dollars!");
            System.out.println("Info: "+x.name+" has now "+x.money+" dollars!");
        }
        else {
            System.out.println("Failed! Come on! Too young to be a spy!");
        }
    }




    public Player(Guns gun, boolean terorist, String name ){
        this.setTerorist(terorist);
        this.setName(name);
        this.setGuns(gun);
    }


    //encapsulation(setter, getter.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealt() {
        return healt;
    }

    public void setHealt(int healt) {
        this.healt = healt;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public boolean isTerorist() {
        return terorist;
    }

    public void setTerorist(boolean terorist) {
        this.terorist = terorist;
    }


    public Guns getGuns() {
        return gun;
    }

    public void setGuns(Guns guns) {
        this.gun = guns;
    }
}
