package listeners;

import user.News;
import user.Translation;
import user.User;

public interface Subscribe {
    void update(String str, User user);
    void update(String str);
}
