package translator;

import person.Person;

public interface Translator {
    Person getPerson(long id);
    Person translate(String str);
}
