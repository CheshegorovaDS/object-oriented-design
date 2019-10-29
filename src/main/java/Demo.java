import editor.Editor;
import listeners.NewsListener;
import listeners.Subscribe;
import listeners.TranslationListener;
import user.User;

public class Demo {

    public static void main(String[] args){
        Editor editor = new Editor();
        User user = new User("Nikolay");
        editor.eventManager.subscribe("news",new NewsListener(user));
        editor.eventManager.subscribe("translation",new TranslationListener(user));

        editor.creatingRecord(user);
        editor.translation(user);

    }

}
