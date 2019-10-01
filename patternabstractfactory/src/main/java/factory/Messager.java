package factory;

import background.Background;
import text.Text;

public interface Messager {
    Background createBackground();
    Text createText();
}
