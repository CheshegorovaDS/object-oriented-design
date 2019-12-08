package decorators;

// Один из конкретных компонентов реализует базовую
// функциональность.
public class NotificationDecorator implements Notification{

    public NotificationDecorator() {

    }

    public void sendNotification(String message) {
        System.out.println("Twinkle");
        System.out.println("Vibration");
    }
}
