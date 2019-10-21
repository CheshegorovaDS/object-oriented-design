public class App {
    PersonalData personalData = PersonalData.getInstance("login");
    String nameOfUser = personalData.getPerson().getName();
}
