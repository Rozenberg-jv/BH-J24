package by.belhard.j24.homeworks.hw7.task1;

public class Main {

    public static void main(String[] args) {

        PersonList list = new PersonList();

        System.out.println(list.findPersonByName("Mike"));
        System.out.println(list.findPersonByName("Vasily"));
        System.out.println(list.findPersonByName(""));
    }


}
