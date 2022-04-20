public class RangedW extends Weapon{
    private int bullet=20;
    private double misfired=30;

    public RangedW(String name, int damage, int cost, int affaectiveRange) {
        super(name, damage, cost,affaectiveRange);

    }

    @Override
    public int getBullet() {
        return bullet;
    }

    @Override
    public void setBullet(int bullet) {
        this.bullet = bullet;
    }

    @Override
    public double getMisfired() {
        return misfired;
    }

    @Override
    public void setMisfired(double misfiredRate) {
        this.misfired = misfired;
    }
}
