package editor;

import user.User;
import publisher.EventManager;

// Конкретный класс-издатель, содержащий интересную для других
// компонентов бизнес-логику. Мы могли бы сделать его прямым
// потомком EventManager, но в реальной жизни это не всегда
// возможно (например, если у класса уже есть родитель). Поэтому
// здесь мы подключаем механизм подписки при помощи композиции.
public class Editor {
    private EventManager eventManager;

    public Editor() {
        eventManager = new EventManager();
    }

    public void creatingRecord(User user){
        eventManager.notify("news", user);
    }

    public void translation(User user){
        eventManager.notify("translation", user);
    }
}
