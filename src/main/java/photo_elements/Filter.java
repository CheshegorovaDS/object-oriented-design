package photo_elements;

public enum  Filter {

    BLACK_WHITE("Black white"),
    SUN("Sun"),
    CITY("City"),
    NEON("Neon"),
    LOMO("Lomo");

    private String name;

    Filter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
