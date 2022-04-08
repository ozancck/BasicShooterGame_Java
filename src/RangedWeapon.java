public class RangedWeapon extends Weapon{
    private int ammo=20;
    private double misfiredRate=30;

    public RangedWeapon(String name, int damage, int cost, int affaectiveRange) {
        super(name, damage, cost,affaectiveRange);

    }

    @Override
    public int getAmmo() {
        return ammo;
    }

    @Override
    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    @Override
    public double getMisfiredRate() {
        return misfiredRate;
    }

    @Override
    public void setMisfiredRate(double misfiredRate) {
        this.misfiredRate = misfiredRate;
    }
}
