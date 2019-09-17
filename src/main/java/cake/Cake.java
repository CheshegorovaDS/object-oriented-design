package cake;

import components.Cream;
import components.Korzh;
import components.Topping;
import java.util.Objects;

public class Cake {
    private Korzh korzh;
    private Topping topping;
    private Cream cream;
    private int countBiscuit;

    public Cake(Korzh korzh, Topping topping, Cream cream, int countBiscuit) {
        this.korzh = korzh;
        this.topping = topping;
        this.cream = cream;
        this.countBiscuit = countBiscuit;
    }

    public Cake() {
    }

    public Korzh getKorzh() {
        return korzh;
    }

    public Topping getTopping() {
        return topping;
    }

    public Cream getCream() {
        return cream;
    }

    public int getCountBiscuit() {
        return countBiscuit;
    }

    @Override
    public String toString() {
        return "{" +
                "korzh=" + korzh +
                ", topping=" + topping +
                ", cream=" + cream.toString() +
                ", countBiscuit=" + countBiscuit +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cake)) return false;
        Cake cake = (Cake) o;
        return countBiscuit == cake.countBiscuit &&
                korzh == cake.korzh &&
                topping == cake.topping &&
                Objects.equals(cream, cake.cream);
    }

    @Override
    public int hashCode() {
        return Objects.hash(korzh, topping, cream, countBiscuit);
    }
}
