package components;

import java.util.Objects;

public class Cream {
    private int eggs;
    private double milk;
    private boolean chocolateChip;

    public Cream(int eggs, double milk, boolean chocolateChip) {
        this.eggs = eggs;
        this.milk = milk;
        this.chocolateChip = chocolateChip;
    }

    @Override
    public String toString() {
        return "Cream{" +
                "eggs=" + eggs +
                ", milk=" + milk +
                ", chocolateChip=" + chocolateChip +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cream)) return false;
        Cream cream = (Cream) o;
        return eggs == cream.eggs &&
                Double.compare(cream.milk, milk) == 0 &&
                chocolateChip == cream.chocolateChip;
    }

    @Override
    public int hashCode() {
        return Objects.hash(eggs, milk, chocolateChip);
    }
}
