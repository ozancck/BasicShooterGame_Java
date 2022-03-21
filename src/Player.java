
public class Player {

    //there is 5 properties.
    private String name;
    private int healt=100;
    private int money=1000;
    private boolean terorist;
    private int bullet = 20;


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
            double number =(double)(Math.random()*10);

            if (number<7) {

                // health 20 decreasing
                y.healt-=20;
                if (y.healt>=0){
                    //bullet decreasing
                    this.bullet-=1;

                    System.out.println("Success! pinpoint accuracy!");
                    System.out.println("Info: There are "+this.bullet+ " bullet(s) left in "+this.name+"'s magazine.");
                    System.out.println("Info: "+y.name+"'s health level is decreased to "+y.healt+".");
                }
                else {

                    //health is 0
                    System.out.println("Failed! The enemy is already dead!");
                }

            }
            else {
                this.bullet-=1;
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
        int lls = 20;
        int needBullet = lls-this.bullet;
        this.setBullet(20);
        this.money-=needBullet*5;

        System.out.println("Success! The real war begins now!");
        System.out.println("Info: kayla has now "+this.bullet+" bullets in the magazine!");
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




    public Player(boolean terorist, String name ){
        this.setTerorist(terorist);
        this.setName(name);
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


    public int getBullet() {
        return bullet;
    }

    public void setBullet(int bullet) {
        this.bullet = bullet;
    }
}
