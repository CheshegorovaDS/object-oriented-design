import decorators.BaseDecorator;
import decorators.Notification;
import decorators.NotificationDecorator;
import decorators.PriorityDecorator;

public class Demo {
    public static void main(String[] args){
        BaseDecorator decorator = new PriorityDecorator(new NotificationDecorator());
        decorator.sendNotification("Hello");
    }
}
