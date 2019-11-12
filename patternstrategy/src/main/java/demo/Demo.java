package demo;

import strategies.Delivery;
import strategies.DeliveryByCourier;
import strategies.Order;
import strategies.Pickup;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args){
        long idUser = 1234;
        List<String> goods = new ArrayList<>();

        System.out.println("Pickup");
        Delivery delivery = new Pickup();
        Order order = new Order(idUser,  goods);

        order.processOrder(delivery);
        System.out.println();

        System.out.println("Delivery by courier.");
        Delivery delivery2 = new DeliveryByCourier();
        order.processOrder(delivery2);

    }

}
