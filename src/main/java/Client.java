import builders.CakeBuilder;
import cake.Cake;
import director.Director;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();

        CakeBuilder cakeBuilder = new CakeBuilder();
        director.constructPragueCake(cakeBuilder);

        Cake cake = cakeBuilder.getResult();
        System.out.println(cake.toString());


        director.constructHoneyCake(cakeBuilder);
        Cake cake2 = cakeBuilder.getResult();
        System.out.println(cake2.toString());
    }
}
