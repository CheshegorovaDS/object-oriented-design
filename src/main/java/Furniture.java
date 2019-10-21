import java.util.Objects;

public abstract class Furniture {
    private double height;
    private double length;
    private double width;

    public Furniture(Furniture furniture){
        height = furniture.height;
        length = furniture.length;
        width = furniture.width;
    }

    public Furniture(double height, double length, double width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public abstract Furniture clone();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Furniture)) return false;
        Furniture furniture = (Furniture) o;
        return Double.compare(furniture.height, height) == 0 &&
                Double.compare(furniture.length, length) == 0 &&
                Double.compare(furniture.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, length, width);
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "height=" + height +
                ", length=" + length +
                ", width=" + width +
                '}';
    }
}
