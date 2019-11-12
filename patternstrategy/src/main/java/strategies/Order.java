package strategies;

import java.util.List;

public class Order {
    private long idUser;
    private List<String> list;

    public Order(long idUser, List<String> list) {
        this.idUser = idUser;
        this.list = list;
    }

    public void processOrder(Delivery delivery){
        if(isGoods()) {
            delivery.collectMoreInfo(idUser);
            System.out.println(delivery.getReadinessOrder());
            if(!delivery.placeOrder().equals("")) {
                System.out.println(delivery.placeOrder());
            }
            System.out.println("Cost is "+delivery.getCostOrder());
        }
    }

    private boolean isGoods(){
        //check availabity goods
        return true;
    }


}
