package director;

import builders.Builder;
import components.Cream;
import components.Korzh;
import components.Topping;

public class Director {

    public void constructHoneyCake(Builder builder){
        builder.setCountBuiscuit(5);
        builder.setCream(new Cream(3,5,false));
        builder.setKorzh(Korzh.BISCUIT);
        builder.setTopping(Topping.CARAMEL);
    }

    public void constructPragueCake(Builder builder){
        builder.setCountBuiscuit(3);
        builder.setCream(new Cream(3,10,true));
        builder.setKorzh(Korzh.BISCUIT);
        builder.setTopping(Topping.CHOCOLATE);
    }


}
