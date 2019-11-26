package photo_elements;

public enum  Image {
    STAR("Star"),
    SUN("Sun"),
    MOON("Moon");

    private String name;

    Image(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
