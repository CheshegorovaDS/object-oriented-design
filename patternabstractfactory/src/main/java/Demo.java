import app.Application;
import factory.Messager;
import factory.*;
import message.Message;

public class Demo {

    public static void main(String[] args) {
        Application app;
        Messager messager;

        Message message = new Message(true);

        if(message.isOutgoing()){
            messager = new OwnerMessager();
            app = new Application(messager);
        }else{
            messager = new OtherMessager();
            app = new Application(messager);
        }

        app.paint();
    }
}
