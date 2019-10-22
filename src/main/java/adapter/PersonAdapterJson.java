package adapter;

import person.Person;
import service.ServiceJson;
import translator.Translator;

public class PersonAdapterJson implements Translator {
    private ServiceJson serviceJson;

    public Person getPerson(long id) {
        return translate(ServiceJson.getPeopleById(id));
    }

    public Person translate(String str){
        Person person = null;
        //реализация
        return person;
    }


}
