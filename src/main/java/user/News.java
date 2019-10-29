package user;

public class News {
    private long id;
    private String text;
    private String name;

    public News(long id, String text, String name) {
        this.id = id;
        this.text = text;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return " text='" + text + '\'' +
                ", name='" + name;
    }
}
