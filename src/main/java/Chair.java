public class Chair extends Furniture {
    private boolean isBack;

    public Chair(Chair chair) {
        super(chair);
        isBack = chair.isBack;
    }

    public Chair(double height, double length, double width,boolean isBack) {
        super(height, length, width);
        this.isBack = isBack;
    }

    public Furniture clone() {
        return new Chair(this);
    }

    public void setBack(boolean back) {
        isBack = back;
    }

    @Override
    public String toString() {
        return super.toString() +
                "isBack=" + isBack +
                '}';
    }
}
