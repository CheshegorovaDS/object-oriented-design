package listeners;

import user.News;
import user.User;

public class NewsListener implements Subscribe {
    private News news;

    public NewsListener(User user) {
        this.news = user.getLastNews();
    }

    @Override
    public void update(String str, User user) {
        System.out.println("News "+news.toString());
    }
}
