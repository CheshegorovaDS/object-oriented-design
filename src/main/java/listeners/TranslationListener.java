package listeners;

import user.Translation;
import user.User;

public class TranslationListener implements Subscribe {
private Translation translation;

    public TranslationListener(User user) {
        this.translation = user.getTranslation();
    }

    @Override
    public void update(String str, User user) {
        System.out.println("New translation " + translation.toString());
    }
}
