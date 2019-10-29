package publisher;

import user.News;
import listeners.Subscribe;
import user.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Базовый класс-издатель. Содержит код управления подписчиками
// и их оповещения.
public class EventManager {

    private Map<String, List<Subscribe>> map = new HashMap<>();

    public EventManager(String ... events) {
        for(String str: events){
            map.put(str, new ArrayList<Subscribe>());
        }
    }

    public void subscribe(String eventType, Subscribe listener) {
        List<Subscribe> users = map.get(eventType);
        users.add(listener);
    }

    public void unsubscribe(String eventType, Subscribe listener) {
        List<Subscribe> users = map.get(eventType);
        users.remove(listener);
    }

    public void notify(String eventType, User user) {
        List<Subscribe> users = map.get(eventType);
        for (Subscribe listener : users) {
            listener.update(eventType, user);
        }
    }

}
