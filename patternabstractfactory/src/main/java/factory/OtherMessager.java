package factory;

import background.Background;
import background.OtherBackground;
import text.OtherText;
import text.Text;

public class OtherMessager implements Messager {
    public Background createBackground() {
        return new OtherBackground();
    }

    public Text createText() {
        return new OtherText();
    }
}
