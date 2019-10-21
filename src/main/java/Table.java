public class Table extends Furniture{
    private boolean isSlide;

    public Table(Table table) {
        super(table);
        isSlide = table.isSlide;
    }

    public Table(double height, double length, double width,boolean isSlide) {
        super(height, length, width);
        this.isSlide = isSlide;
    }

    public Furniture clone() {
        return new Table(this);
    }

    @Override
    public String toString() {
        return super.toString() +
                "isSlide=" + isSlide +
                '}';
    }
}
