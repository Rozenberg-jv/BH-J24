package by.belhard.j24.homeworks.hw7.task1;

import java.util.ArrayList;
import java.util.List;

public class PersonList {

    private final List<Person> list = new ArrayList<>();

    public PersonList() {
        list.add(new Person("Mike"));
        list.add(new Person("Nik"));
        list.add(new Person("Vasily"));
        list.add(new Person("Anatoly"));
        list.add(new Person("Olga"));
        list.add(new Person("Mike"));
    }

    public List<Person> findPersonByName(String name) {

        List<Person> result = new ArrayList<>();

        for (Person person : list) {
            if (person.getName().equals(name))
                result.add(person);
        }

        return result;
    }

}
