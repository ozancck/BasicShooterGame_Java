public class SniperRifle extends FireArms{
    private double misfiredRate=0.45;
    private boolean scope;
    private int fieldViewDistance;
    private int ammo = 10;

    public SniperRifle(String name, int damage, int cost, int affaectiveRange, boolean scope) {
        super(name, damage, cost, affaectiveRange);
        this.scope = scope;
    }

    @Override
    public double getMisfiredRate() {
        return misfiredRate;
    }

    @Override
    public void setMisfiredRate(double misfiredRate) {
        this.misfiredRate = misfiredRate;
    }

    public boolean isScope() {
        return scope;
    }

    public void setScope(boolean scope) {
        this.scope = scope;
    }

    public int getFieldViewDistance() {
        return fieldViewDistance;
    }

    public void setFieldViewDistance(int fieldViewDistance) {
        this.fieldViewDistance = fieldViewDistance;
    }

    @Override
    public int getAmmo() {
        return ammo;
    }

    @Override
    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }







}
