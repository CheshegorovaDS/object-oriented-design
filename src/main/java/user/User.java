package user;

import java.util.ArrayList;
import java.util.List;

public class User {
    private List<News> news = new ArrayList<>();
    private Translation translation;
    private String name;

    public User(String name) {
        this.name = name;
        translation = new Translation("17:54",name);
        news.add(new News(0,"Hello",name));
    }



    public News getNewsById(long id) {
        for(News n: news){
            if(n.getId() == id){
                return n;
            }
        }
        return null;
    }

    public News getLastNews() {
       return news.get(news.size()-1);
    }

    public List<News> getNews() {
        return news;
    }

    public void setNews(News n) {
        news.add(n);
    }

    public Translation getTranslation() {
        return translation;
    }

    public void setTranslation(Translation translation) {
        this.translation = translation;
    }
}
