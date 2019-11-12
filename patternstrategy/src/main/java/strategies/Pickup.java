package strategies;

public class Pickup implements Delivery{
    private long id;
    private String fullName;
    private int time;

    public void collectMoreInfo(long id) {
        this.id = id;
    }

    public String getReadinessOrder() {

        return "You can pick up the order "+getTime();
    }

    public String placeOrder() {
        //подсчет ближайшей точки к дому
        return "ул. Ааа, д.1";
    }

    public String getCostOrder() {
        //cost of order
        return "1000";
    }

    private String getTime(){
        //подсчет времени, когда заказ будет готов
        return "today 18:00";
    }
}
