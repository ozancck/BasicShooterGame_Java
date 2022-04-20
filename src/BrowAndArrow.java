public class BrowAndArrow extends RangedW{
    private boolean supportsPoisoned;
    private boolean statusOfArrowHead;
    private int bullet = 20;

    public BrowAndArrow(String name, int damage, int cost, int affaectiveRange, boolean supportsPoisoned, Boolean statusOfArrowHead) {
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
    public int getBullet() {
        return bullet;
    }

    @Override
    public void setBullet(int bullet) {
        this.bullet = bullet;
    }
}
