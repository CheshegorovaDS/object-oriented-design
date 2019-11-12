package strategies;

public class DeliveryByCourier implements Delivery {
    @Override
    public void collectMoreInfo(long id) {
        //узнаем адрес клиента
    }

    @Override
    public String getReadinessOrder() {
        return "The courier will arrive "+chooseTimeDelivery();
    }

    @Override
    public String placeOrder() {
        return "";
    }

    @Override
    public String getCostOrder() {
        //cost of Goods and work courier
        return "1500";
    }

    private String chooseTimeDelivery(){
        return "tomorrow in 16:00";
    }
}
