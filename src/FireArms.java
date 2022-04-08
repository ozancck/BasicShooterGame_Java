public class FireArms extends RangedWeapon{


    private double misfiredRate=30;
    private int ammo=20;

    public FireArms(String name, int damage, int cost, int affaectiveRange) {
        super(name, damage, cost, affaectiveRange);
    }

    @Override
    public double getMisfiredRate() {
        return misfiredRate;
    }

    @Override
    public void setMisfiredRate(double misfiredRate) {
        this.misfiredRate = misfiredRate;
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
