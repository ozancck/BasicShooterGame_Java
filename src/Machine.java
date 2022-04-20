public class Machine extends Firearms{
    private double misfired=10;
    private boolean sweep;
    private int bullet=100;


    public Machine(String name, int damage, int cost, int affaectiveRange, boolean sweep) {
        super(name, damage, cost, affaectiveRange);
        this.sweep = sweep;
    }


    public boolean isSweep() {
        return sweep;
    }

    public void setSweep(boolean sweep) {
        this.sweep = sweep;
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
    public void setMisfired(double misfired) {
        this.misfired = misfired;
    }
}
