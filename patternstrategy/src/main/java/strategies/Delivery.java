package strategies;

public interface Delivery {
    void collectMoreInfo(long id);
    String getReadinessOrder();
    String placeOrder();
    String getCostOrder();
}
