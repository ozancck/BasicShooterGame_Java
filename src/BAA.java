public class BAA extends RangedWeapon{
    private boolean supportsPoisoned;
    private boolean statusOfArrowHead;
    private int ammo = 20;

    public BAA(String name, int damage, int cost, int affaectiveRange, boolean supportsPoisoned, Boolean statusOfArrowHead) {
        super(name, damage, cost, affaectiveRange);
        this.supportsPoisoned = supportsPoisoned;
        this.statusOfArrowHead = statusOfArrowHead;
    }

    public boolean isSupportsPoisoned() {
        return supportsPoisoned;
    }

    public void setSupportsPoisoned(boolean supportsPoisoned) {
        this.supportsPoisoned = supportsPoisoned;
    }

    public boolean getStatusOfArrowHead() {
        return statusOfArrowHead;
    }

    public void setStatusOfArrowHead(boolean statusOfArrowHead) {
        this.statusOfArrowHead = statusOfArrowHead;
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
