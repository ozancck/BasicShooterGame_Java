public class Sniper extends Firearms{
    private double misfired=0.45;
    private boolean scope;
    private int viewDistance;
    private int bullet = 10;

    public Sniper(String name, int damage, int cost, int affaectiveRange, boolean scope) {
        super(name, damage, cost, affaectiveRange);
        this.scope = scope;
    }

    @Override
    public double getMisfired() {
        return misfired;
    }

    @Override
    public void setMisfired(double misfired) {
        this.misfired = misfired;
    }

    public boolean isScope() {
        return scope;
    }

    public void setScope(boolean scope) {
        this.scope = scope;
    }

    public int getViewDistance() {
        return viewDistance;
    }

    public void setViewDistance(int fieldViewDistance) {
        this.viewDistance = fieldViewDistance;
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
