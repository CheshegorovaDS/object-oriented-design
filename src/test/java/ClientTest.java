import builders.CakeBuilder;
import cake.Cake;
import components.Cream;
import components.Korzh;
import components.Topping;
import director.Director;
import org.junit.jupiter.api.Test;


import static org.junit.Assert.assertEquals;

public class ClientTest {
    @Test
    public void createPragueTest(){
        Director director = new Director();

        CakeBuilder cakeBuilder = new CakeBuilder();
        director.constructPragueCake(cakeBuilder);

        Cake cake = cakeBuilder.getResult();
        Cake expected = new Cake(Korzh.BISCUIT, Topping.CHOCOLATE, new Cream(3,10,true), 3);

        assertEquals(expected,cake);
    }


}
