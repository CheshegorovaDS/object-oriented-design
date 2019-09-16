package components;

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
}
