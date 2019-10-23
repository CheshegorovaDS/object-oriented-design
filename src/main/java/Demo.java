public class Demo {
    public static void main(String[] args) {
        TextWriter textWriter = new TextWriter();

        Facade facade = new Facade(textWriter);
        facade.start();
        facade.stop();
    }
}
