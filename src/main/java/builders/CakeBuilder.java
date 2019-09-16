package builders;

import builders.Builder;
import cake.Cake;
import components.Cream;
import components.Korzh;
import components.Topping;

public class CakeBuilder implements Builder {
    private Korzh korzh;
    private Topping topping;
    private Cream cream;
    private int countBiscuit;

    public void setKorzh(Korzh korzh) {
        this.korzh = korzh;
    }

    public void setTopping(Topping topping) {
        this.topping = topping;
    }

    public void setCountBuiscuit(int countKorzhes) {
        this.countBiscuit = countKorzhes;
    }

    public void setCream(Cream cream) {
        this.cream = cream;
    }

    public Cake getResult(){
        return new Cake(korzh, topping, cream, countBiscuit);
    }
}
