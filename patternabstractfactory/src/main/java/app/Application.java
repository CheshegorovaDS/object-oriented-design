package app;

import background.Background;
import factory.Messager;
import text.Text;

public class Application {
    Text text;
    Background background;

    public Application() {
    }

    public Application(Messager messager) {
        text = messager.createText();
        background = messager.createBackground();
    }

    public void paint(){
        text.paint();
        background.paint();
    }
}
