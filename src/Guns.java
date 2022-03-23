public class Guns {
    private int bullets ;
    private double misFired;
    private int bulletCost;
    //a is a constant fot total bullets.
    private int a;

    //guns properties
    public Guns(int bulletCost, double misFired, int bullets ){
        this.setMisFired(misFired);
        this.setBulletCost(bulletCost);
        this.setBullets(bullets);

        setA(bullets);

    }

    //reload method.
    public void reload(){
        this.setBullets(this.getA());
    }





    public void bulletDecreased(){
        setBullets(getBullets()-1);
    }

    public int getBullets() {
        return bullets;
    }

    public void setBullets(int bullets) {
        this.bullets = bullets;
    }

    public double getMisFired() {
        return misFired;
    }

    public void setMisFired(double misFired) {
        this.misFired = misFired;
    }

    public int getBulletCost() {
        return bulletCost;
    }

    public void setBulletCost(int bulletCost) {
        this.bulletCost = bulletCost;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }


}
