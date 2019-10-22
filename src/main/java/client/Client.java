package client;

import adapter.PersonAdapterJson;
import person.Person;
import translator.Translator;

public class Client {
    private String name;
    private int age;
    private long id;

    public void OnCreate(){
        getId();

        Translator translator = new PersonAdapterJson();

        Person person = translator.getPerson(getId());

        name = person.getName();
        age = person.getAge();
    }
     private long getId(){
        long id = 0;
        //реализация
         return id;
     }
}
