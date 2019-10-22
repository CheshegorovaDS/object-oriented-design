public class App {
    public static void main(String[] args) {
        PersonalData personalData = PersonalData.getInstance("login");
        String nameOfUser = personalData.getPerson().getName();
    }
}
