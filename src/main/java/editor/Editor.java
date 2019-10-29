package editor;

import user.User;
import publisher.EventManager;

// Конкретный класс-издатель, содержащий интересную для других
// компонентов бизнес-логику. Поэтому
// здесь мы подключаем механизм подписки при помощи композиции.
public class Editor {
    public EventManager eventManager;

    public Editor() {
        eventManager = new EventManager("translation","news");
    }

    public void creatingRecord(User user){
        eventManager.notify("news", user);
    }

    public void translation(User user){
        eventManager.notify("translation", user);
    }
}
