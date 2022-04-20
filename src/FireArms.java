public class Firearms extends RangedW{


    private double misfired=30;
    private int bullet=20;

    public Firearms(String name, int damage, int cost, int affaectiveRange) {
        super(name, damage, cost, affaectiveRange);
    }

    @Override
    public double getMisfired() {
        return misfired;
    }

    @Override
    public void setMisfired(double misfiredRate) {
        this.misfired = misfired;
    }




    @Override
    public int getBullet() {
        return bullet;
    }

    @Override
    public void setBullet(int bullet) {
        this.bullet = bullet;
    }
}
