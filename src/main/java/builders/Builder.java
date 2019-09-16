package builders;

import components.Cream;
import components.Korzh;
import components.Topping;

public interface Builder {
    void setKorzh(Korzh korzh);
    void setTopping(Topping topping);
    void setCountBuiscuit(int countKorzhes);
    void setCream(Cream cream);
}
