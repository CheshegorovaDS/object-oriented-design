package factory;

import background.Background;
import background.OwnerBackground;
import text.OwnerText;
import text.Text;

public class OwnerMessager implements Messager{

    public Background createBackground() {
        return new OwnerBackground();
    }

    public Text createText() {
        return new OwnerText();
    }
}
