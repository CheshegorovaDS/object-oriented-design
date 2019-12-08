package decorators;

public class PriorityDecorator extends BaseDecorator {

    public PriorityDecorator(Notification notification) {
        super(notification);
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Message is displayed on the screen.");
        super.sendNotification(message);
    }
}
