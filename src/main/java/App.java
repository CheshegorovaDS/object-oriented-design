public class App {

    public static void main(String[] args) {
        Chair chair = new Chair(40, 40, 60, true);
        Table table = new Table(100, 200, 200, false);

        Chair cloneChair = (Chair) chair.clone();

        chair.setBack(false);

        System.out.println(chair.toString());;
        System.out.println(cloneChair.toString());;
    }
}
