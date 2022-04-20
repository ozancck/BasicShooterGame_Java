import java.awt.geom.Point2D;
import java.util.ArrayList;

public class Player {

    private String name;
    private double h = 100;  //h is healt
    private int money = 500;
    public boolean Terrorist;
    private boolean beginnerAmateur;
    private double xPosition;
    private double yPosition;
    private ArrayList<Weapon> weapons = new ArrayList<>();  //this is for inventory



    public Player(String name, boolean terrorist, boolean beginnerAmateur) {
        this.name = name;
        Terrorist = terrorist;
        this.beginnerAmateur = beginnerAmateur;
        if (!this.beginnerAmateur) {
            this.setMoney(1000);
        }
    }


    public void position(){
        System.out.println(this.getName()+" position ("+this.getxPosition()+"," +this.getyPosition() +")"   );
    }

    public void shoot(Player player, Weapon x) {
        //this for calculate the distance
        double distance = Point2D.distance(this.getxPosition(), this.getyPosition(), player.getxPosition(), player.getyPosition());

        //we have this weapon

        if (inArray(x)) {
            //the distance is enough
            if (x.getAffectiveRange() >= distance) {

                //target is terrorist or not
                if (this.Terrorist == player.Terrorist) {
                    System.out.println("Failed! Target player is on the same side!");
                }

                //target is not terrorist
                else {
                    //this is for melee weapons. Because there is no bulelt
                    if (x.getClass() == MeleeW.class) {
                        // health decreasing
                        player.h -= x.getDamage();
                        if (player.h >= 0) {
                            //bullet decreasing
                            //this.bullet-=1;

                            System.out.println("Success! pinpoint accuracy!");
                            System.out.println("Info: " + player.name + "'s health level is decreased to " + player.h + ".");
                        }
                        else if (player.h <= 0) {
                            System.out.println("Failed! The enemy is already dead!");
                        }

                    }

                    //this for machine gun. There is sweep.
                    if (x.getClass() == Machine.class && ((Machine) x).isSweep()) {
                        //for loop for sweep
                        for (int i = 1; i < 11; i++) {
                            System.out.println("");
                            System.out.println("Bullet #" + i + " (Sweep Mode)");


                            int number = (int) (Math.random() * 100);

                            if (number >= x.getMisfired()) {

                                player.h -= x.getDamage();
                                x.setBullet(x.getBullet() - 1);
                                if (player.h >= 0 && x.getBullet() > 0) {

                                    System.out.println("Success! pinpoint accuracy!");
                                    System.out.println("Info: There are " + x.getBullet() + " bullet(s) left in " + this.name + "'s magazine.");
                                    System.out.println("Info: " + player.name + "'s health level is decreased to " + player.h + ".");
                                } else if (x.getBullet() == 0) {
                                    System.out.println("Run out of bullets");

                                } else {
                                    System.out.println("Failed! The enemy is already dead!");
                                }

                            }

                            //misfired
                            else {
                                x.setBullet(x.getBullet() - 1);
                                System.out.println("Failed! Pistol misfired!");
                            }

                        }
                    }

                    // this is for other weapons
                    else {
                        int _number = (int) (Math.random() * 100);

                        if (_number >= x.getMisfired()) {

                            if (x.getClass() == MeleeW.class && ((MeleeW) x).getStatusOfWeapon().equals("non-fired")) {
                                player.h -= (x.getDamage()) + 5;
                            } else {
                                player.h -= x.getDamage();
                            }
                            x.setBullet(x.getBullet() - 1);
                            if (player.h >= 0 && x.getBullet() > 0) {

                                System.out.println("Success! pinpoint accuracy!");
                                System.out.println("Info: There are " + x.getBullet() + " bullet(s) left in " + this.name + "'s magazine.");
                                System.out.println("Info: " + player.name + "'s health level is decreased to " + player.h + ".");
                            } else if (x.getBullet() == 0) {
                                System.out.println("Run out of bullets");

                            } else {
                                System.out.println("Failed! The enemy is already dead!");
                            }

                        } else {
                            //this.bullet-=1;
                            x.setBullet(x.getBullet() - 1);
                            System.out.println("Failed! Pistol misfired!");
                        }

                    }

                }
            } else {
                System.out.println("distance is too much");
            }

        } else {
            System.out.println("There is no this weapon in your inventory");
        }


    }

    public void takesCure() {

        if (this.money >= 500) {

            this.money -= 500;
            this.h = 100;
            System.out.println("Success! " + this.name + " is now as fit as s(he) has never been before!");
            System.out.println("Info: " + this.name + "'s healt level is now 100.");
            System.out.println("Info : " + this.name + " has now " + this.money + " dollars!");

        } else {
            System.out.println("Failed! " + this.getName() + " doesn't have enough money!");
        }

    }

    public void loadsMagazine(Weapon x) {


        int reloaded = 20 - x.getBullet();
        this.money -= (reloaded * 5);
        x.setBullet(20);

        System.out.println("Success! The real war begins now!");
        System.out.println("Info: " + this.name + " has now " + x.getBullet() + " bullets in the magazine!");
        System.out.println("Info: " + this.name + " has now " + this.money + " dollars!");

    }

    public void loansMoney(Player x, int debt) {


        if (this.Terrorist != x.Terrorist) {
            System.out.println("Failed! Come on! Too young to be a spy!");


        } else {
            this.money -= debt;
            x.money += debt;
            System.out.println("Success! " + this.name + " is a perfect philanthropist!");
            System.out.println("Info: " + this.name + " has now " + this.money + " dollars!");
            System.out.println("Info: " + x.name + " has now " + x.money + " dollars!");

        }
    }

    public void immortal() {
        if (this.money >= 600) {
            this.money -= 600;
            this.h =Double.POSITIVE_INFINITY;
            System.out.println("now " + this.getName() + " is immortal.");
        } else {
            System.out.println("failed! " + this.getName() + " has no enough money.");
        }

        //600 dolar, masterExpert olmalı ıyuncu, zaten ölümsüzse bir daha olamıyor.
    }

    public void scopeAttached(Weapon x) {

        if (inArray(x)){
            if (x.getClass() == Sniper.class && !((Sniper) x).isScope()) {
                ((Sniper) x).setScope(true);
                x.setMisfired(1);
                ((Sniper) x).setViewDistance(30);
                System.out.println("Scope Attached to " + x.getName());
            } else {
                System.out.println("Unsupported Weapon");
            }
        }else {
            System.out.println("there is no this weapon in your inventory");
        }
    }

    public void scopeDetached(Weapon x) {
        if (inArray(x)){
            if (x.getClass() == Sniper.class && !((Sniper) x).isScope()) {
                ((Sniper) x).setScope(false);
                x.setMisfired(45);
                ((Sniper) x).setViewDistance(0);
                System.out.println("Scope Attached to " + x.getName());
            } else {
                System.out.println("Unsupported Weapon");
            }
        }else {
            System.out.println("there is no this weapon in your inventory");
        }
    }

    public void poisonMaker(Weapon x) {
        if (inArray(x)){
            if (x.getClass() == BrowAndArrow.class && ((BrowAndArrow) x).isSupportsPoisoned()) {
                ((BrowAndArrow) x).setStatusOfArrowHead(true);
                x.setDamage(x.getDamage() + 15);
                System.out.println(x.getName() + " has poison now!");
            } else {
                System.out.println("failed! unsupported");
            }
        } else {
            System.out.println("No this weapon in your inventory");
        }
    }

    public void showInventory() {

        System.out.println(this.getName() + "'s inventory");
        for (Weapon weapon : weapons) {
            System.out.println(weapon.getName());
        }
    }

    public void addWeapon(Weapon x) {
        if (!this.beginnerAmateur) {
            if (this.weapons.size() < 5 && this.getMoney() >= x.getCost()) {
                weapons.add(x);
                this.setMoney(getMoney() - x.getCost());
                System.out.println("Weapon added to inventory");
            } else {
                System.out.println("there is no money or inventory is full");
            }
        } else {
            if (this.weapons.size() < 2 && this.getMoney() >= x.getCost()) {
                weapons.add(x);
                this.setMoney(getMoney() - x.getCost());
                System.out.println("Weapon added to inventory(" + x.getName() + ")");
            } else {
                System.out.println("there is no money or inventory is full");
            }
        }
    }

    public void sweepOn(Weapon x) {

        if (inArray(x)){
            if (x.getClass() == Machine.class && !((Machine) x).isSweep()) {
                ((Machine) x).setSweep(true);
                System.out.println("Sweep On " + x.getName());
            } else {
                System.out.println("Unsupported Weapon for Sweep on "+x.getName());

            }
        }else {
            System.out.println("there is no this weapon in your inventory");
        }

    }

    //control method.
    public boolean inArray(Weapon x) {
        boolean isIn = false;
        for (Weapon weapon : weapons) {
            if (weapon == x) {
                isIn = true;
                break;
            }
        }
        return isIn;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public boolean IsTerrorist() {
        return Terrorist;
    }

    public void setTerrorist(boolean Terrorist) {
        this.Terrorist = Terrorist;
    }

    public boolean isBeginnerAmateur() {
        return beginnerAmateur;
    }

    public void setBeginnerAmateur(boolean beginnerAmateur) {
        this.beginnerAmateur = beginnerAmateur;
    }

    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(ArrayList<Weapon> weapons) {
        this.weapons = weapons;
    }

    public double getxPosition() {
        return xPosition;
    }

    public void setxPosition(double xPosition) {
        this.xPosition = xPosition;
    }

    public double getyPosition() {
        return yPosition;
    }

    public void setyPosition(double yPosition) {
        this.yPosition = yPosition;
    }






}






