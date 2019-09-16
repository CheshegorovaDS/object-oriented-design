package cake;

import components.Cream;
import components.Korzh;
import components.Topping;

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
}
