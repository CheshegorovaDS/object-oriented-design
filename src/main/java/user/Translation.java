package user;

public class Translation {
    private String time;
    private String nameUser;

    public Translation(String time, String nameUser) {
        this.time = time;
        this.nameUser = nameUser;
    }

    @Override
    public String toString() {
        return "time='" + time + '\'' +
                ", nameUser='" + nameUser;
    }
}
