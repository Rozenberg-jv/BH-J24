package by.belhard.j24.homeworks.hw5.task01_1;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("", 20, BookFormat.A3, "", "");
        Book bookNull = new Book(null, 20, BookFormat.A3, null);

        System.out.println(book1);
        System.out.println(bookNull);
    }
}
