package decorators;

public class SoundNotification extends BaseDecorator {

    public SoundNotification(Notification notification) {
        super(notification);
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Tu-du");
        super.sendNotification(message);
    }
}
