import java.util.ArrayList;

public class Weapon {
    private int bullet;
    private double misfired;
    private String name;
    private int damage;
    private int cost;
    private int affectiveRange;



    public Weapon(String name, int damage, int cost,int affectiveRange) {
        this.name = name;
        this.damage = damage;
        this.cost = cost;
        this.affectiveRange=affectiveRange;
    }

    public int getBullet() {
        return bullet;
    }

    public void setBullet(int ammo) {
        this.bullet = ammo;
    }

    public double getMisfired() {
        return misfired;
    }

    public void setMisfired(double misfiredRate) {
        this.misfired = misfiredRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getAffectiveRange() {
        return affectiveRange;
    }

    public void setAffectiveRange(int affectiveRange) {
        this.affectiveRange = affectiveRange;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }




}
