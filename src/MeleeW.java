public class MeleeW extends Weapon{
    private boolean supportsFire;
    private String statusOfWeapon;

    public MeleeW(String name, int damage, int cost, int affectiveRange, boolean supportsFire, String statusOfWeapon) {
        super(name, damage, cost, affectiveRange);
        this.supportsFire = supportsFire;
        this.statusOfWeapon = statusOfWeapon;
    }

    public boolean isSupportsFire() {
        return supportsFire;
    }

    public void setSupportsFire(boolean supportsFire) {
        this.supportsFire = supportsFire;
    }

    public String getStatusOfWeapon() {
        return statusOfWeapon;
    }

    public void setStatusOfWeapon(String statusOfWeapon) {
        this.statusOfWeapon = statusOfWeapon;
    }
}
