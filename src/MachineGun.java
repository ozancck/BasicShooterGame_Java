public class MachineGun extends FireArms{
    private double misfiredRate=10;
    private boolean sweep;
    private int ammo=100;


    public MachineGun(String name, int damage, int cost, int affaectiveRange, boolean sweep) {
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
