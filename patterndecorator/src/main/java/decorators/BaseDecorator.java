package decorators;

public class BaseDecorator implements Notification {
    private Notification notification;

    public BaseDecorator(Notification notification) {
        this.notification = notification;
    }

    public void sendNotification(String message) {
        notification.sendNotification(message);
    }
}
