public final class PersonalData {

    private static PersonalData personalData;
    private Person person;
    private String login;

    private PersonalData(String login) {
        //запрос на получение пользователя по логину
        person = new Person(login);
        this.login = login;
    }

    public static PersonalData getInstance(String login){
        if(personalData == null){
            personalData = new PersonalData(login);
        }
        return personalData;
    }

    public Person getPerson() {
        return person;
    }
}
