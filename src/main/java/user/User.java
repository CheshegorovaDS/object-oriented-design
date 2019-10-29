package user;

import java.util.List;

public class User {
    private List<News> news;
    private Translation translation;

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
